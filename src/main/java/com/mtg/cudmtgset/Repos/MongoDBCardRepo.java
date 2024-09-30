package com.mtg.cudmtgset.Repos;

import java.util.List;

import org.bson.BsonDocument;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.TransactionOptions;
import com.mongodb.WriteConcern;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mtg.cudmtgset.Models.MTGSetCardModel;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.and;

import java.util.ArrayList;

@Repository
public class MongoDBCardRepo implements CardRepo{

    private static final TransactionOptions transOption = TransactionOptions.builder()
                                                                            .readPreference(ReadPreference.primary())
                                                                            .readConcern(ReadConcern.MAJORITY)
                                                                            .writeConcern(WriteConcern.MAJORITY)
                                                                            .build();

    private final MongoClient client;
    private MongoCollection<MTGSetCardModel> cardCollection;
    public MongoDBCardRepo(MongoClient client){
        this.client = client;
    }

    @PostConstruct
    void  init(){
        cardCollection = client.getDatabase("MTG").getCollection("CardCollection", MTGSetCardModel.class);
    }

    @Override
    public List<MTGSetCardModel> getCardsBySetName(String setName,String legality) {
        return cardCollection.find(and(eq("set_name",setName),eq("legalities."+legality,true))).into(new ArrayList<>());
    }

}
