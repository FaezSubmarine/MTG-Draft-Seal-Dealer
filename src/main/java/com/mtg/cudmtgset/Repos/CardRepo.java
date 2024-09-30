package com.mtg.cudmtgset.Repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mtg.cudmtgset.Models.MTGSetCardModel;

@Repository
public interface CardRepo {
    List<MTGSetCardModel> getCardsBySetName(String set,String legality);
}