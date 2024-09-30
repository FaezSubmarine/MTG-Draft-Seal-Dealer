package com.mtg.cudmtgset.Controllers;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mtg.cudmtgset.Services.ICardService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CardController {
    private final static Logger LOGGER = LoggerFactory.getLogger(CardController.class);
    private final ICardService cardService;

    @Autowired
    private ObjectMapper mapper;

    public CardController(ICardService cardService){
        this.cardService = cardService;
    }
    @GetMapping("Ping")
    public String ping() {
        return "Ping";
    }
    @GetMapping("Open Booster Pack")
    public String openBoosterPack(@RequestParam String setName,@RequestParam String legality) throws JsonProcessingException {
        return mapper.writeValueAsString(cardService.assembleBoosterPacks(setName, legality));
    }
}