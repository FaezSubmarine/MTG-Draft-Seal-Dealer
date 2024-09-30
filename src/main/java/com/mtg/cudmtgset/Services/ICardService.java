package com.mtg.cudmtgset.Services;

import java.util.List;

import com.mtg.cudmtgset.Models.MTGSetCardModel;
public interface ICardService {
    List<MTGSetCardModel> getCardsBySetName(String setName,String legality);
    List<MTGSetCardModel> assembleBoosterPacks(String setName,String legality);
}
