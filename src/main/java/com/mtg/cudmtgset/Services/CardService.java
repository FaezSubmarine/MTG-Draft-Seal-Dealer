package com.mtg.cudmtgset.Services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.mtg.cudmtgset.Models.MTGSetCardModel;
import com.mtg.cudmtgset.Repos.MongoDBCardRepo;

@Service
public class CardService implements ICardService{
    private final MongoDBCardRepo cardRepo;
    
    public CardService(MongoDBCardRepo cardRepo){
        this.cardRepo = cardRepo;
    }

    @Override
    public List<MTGSetCardModel> getCardsBySetName(String setName,String legality) {
        return cardRepo.getCardsBySetName(setName, legality);
    }

    @Override
    public List<MTGSetCardModel> assembleBoosterPacks(String setName,String legality) {
        List<MTGSetCardModel> allCards = cardRepo.getCardsBySetName(setName, legality);
        Random rand = new Random();
        List<MTGSetCardModel> boosterPack = addCardsByRarity(allCards.stream().filter(x->Objects.equals(x.getRarity(),"common") && !isLands(x.getName())).toList(), 10,rand);
        boosterPack.addAll(addCardsByRarity(allCards.stream().filter(x-> Objects.equals(x.getRarity(),"uncommon")).toList(), 3,rand));
        boosterPack.addAll(addCardsByRarity(allCards.stream().filter(x-> Objects.equals(x.getRarity(),"rare") || Objects.equals(x.getRarity(),"mythic")).toList(), 1,rand));
        boosterPack.add(addCardsByRarity(allCards.stream().filter(x->isLands(x.getName())).toList(),1,rand).get(0));
        return boosterPack;
    }
    private Boolean isLands(String subject){
        return Objects.equals(subject, "Forest") || Objects.equals(subject, "Swamp") || Objects.equals(subject, "Plains") || Objects.equals(subject, "Island")|| Objects.equals(subject, "Mountain");
    }
    private List<MTGSetCardModel> addCardsByRarity(List<MTGSetCardModel> cards,int quantity,Random rand){
        List<MTGSetCardModel> subjects = new ArrayList<MTGSetCardModel>();
        while(subjects.size() != quantity){
            subjects.add(cards.get(rand.nextInt(0,cards.size())));
        }
        return subjects;
    }
}
