package com.mtg.cudmtgset.Models;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
public class MTGSetCardModel {
    public MTGSetCardModel(){

    }
    public MTGSetCardModel(String name,
    String rarity,
    String lang,
    String png,
    String mana_cost,
    int cmc,
    String type_line,
    String bottom_text,
    List<String> colors,
    List<String> keywords,
    Legalities legalities,
    String set,
    String set_name){
        this.name = name;
        this.rarity = rarity;
        this.lang = lang;
        this.png = png;
        this.mana_cost = mana_cost;
        this.cmc = cmc;
        this.type_line = type_line;
        this.bottom_text = bottom_text;
        this.colors = colors;
        this.keywords = keywords;
        this.legalities = legalities;
        this.set = set;
        this.set_name = set_name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRarity(){
        return rarity;
    }
    public void setRarity(String rarity){
        this.rarity = rarity;
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    public String getPng() {
        return png;
    }
    public void setPng(String png) {
        this.png = png;
    }
    public String getMana_cost() {
        return mana_cost;
    }
    public void setMana_cost(String mana_cost) {
        this.mana_cost = mana_cost;
    }
    public int getCmc() {
        return cmc;
    }
    public void setCmc(int cmc) {
        this.cmc = cmc;
    }
    public String getType_line() {
        return type_line;
    }
    public void setType_line(String type_line) {
        this.type_line = type_line;
    }
    public String getBottom_text() {
        return bottom_text;
    }
    public void setBottom_text(String bottom_text) {
        this.bottom_text = bottom_text;
    }
    public List<String> getColors() {
        return colors;
    }
    public void setColors(List<String> colors) {
        this.colors = colors;
    }
    public List<String> getKeywords() {
        return keywords;
    }
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
    public Legalities getLegalities() {
        return legalities;
    }
    public void setLegalities(Legalities legalities) {
        this.legalities = legalities;
    }
    public String getSet() {
        return set;
    }
    public void setSet(String set) {
        this.set = set;
    }
    public String getSet_name() {
        return set_name;
    }
    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }

    @Id private String id;
    @JsonProperty("name")
    String name;
    @JsonProperty("lang")
    String lang;
    @JsonProperty("rarity")
    String rarity;
    String png;
    @JsonProperty("image_uris")
    private void getPNG(Map<String,String> pngStr){
        png = pngStr.get("png");
    }
    @JsonProperty("mana_cost")
    String mana_cost;
    @JsonProperty("cmc")
    int cmc;
    @JsonProperty("type_line")
    String type_line;
    @JsonProperty("oracle_text")
    String bottom_text;
    @JsonProperty("color_identity")
    List<String> colors;
    @JsonProperty("keywords")
    List<String> keywords;
    Legalities legalities;
    @JsonProperty("legalities")
    private void getLegalities(Map<String,String> legStr){
        legalities = new Legalities(legStr);
    }
    @JsonProperty("set")
    String set;
    @JsonProperty("set_name")
    String set_name;

    @Override
    public String toString(){
        return String.format("{\"_id\":%s,\"name\":%s,\"lang\":%s,\"png\":%s,\"mana_cost\":%s,\"cmc\":%s,\"type_line\":\"%s\",\"bottom_text\":%s,\"colors\":%s,\"keywords\":%s,\"legalties\":%s,\"set\":%s,\"set_name\":%s}",
                                     id,name,lang,png,mana_cost,String.valueOf(cmc),type_line,bottom_text,String.join(", ",colors),String.join(", ", keywords),legalities.toString(),set,set_name);
    }
}
