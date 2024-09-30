package com.mtg.cudmtgset.Models;

import java.util.Map;
import java.util.Objects;

public class Legalities {
    public Boolean getStandard() {
        return standard;
    }
    public void setStandard(Boolean standard) {
        this.standard = standard;
    }
    public Boolean getFuture() {
        return future;
    }
    public void setFuture(Boolean future) {
        this.future = future;
    }
    public Boolean getHistoric() {
        return historic;
    }
    public void setHistoric(Boolean historic) {
        this.historic = historic;
    }
    public Boolean getTimeless() {
        return timeless;
    }
    public void setTimeless(Boolean timeless) {
        this.timeless = timeless;
    }
    public Boolean getGladiator() {
        return gladiator;
    }
    public void setGladiator(Boolean gladiator) {
        this.gladiator = gladiator;
    }
    public Boolean getPioneer() {
        return pioneer;
    }
    public void setPioneer(Boolean pioneer) {
        this.pioneer = pioneer;
    }
    public Boolean getExplorer() {
        return explorer;
    }
    public void setExplorer(Boolean explorer) {
        this.explorer = explorer;
    }
    public Boolean getModern() {
        return modern;
    }
    public void setModern(Boolean modern) {
        this.modern = modern;
    }
    public Boolean getLegacy() {
        return legacy;
    }
    public void setLegacy(Boolean legacy) {
        this.legacy = legacy;
    }
    public Boolean getPauper() {
        return pauper;
    }
    public void setPauper(Boolean pauper) {
        this.pauper = pauper;
    }
    public Boolean getVintage() {
        return vintage;
    }
    public void setVintage(Boolean vintage) {
        this.vintage = vintage;
    }
    public Boolean getPenny() {
        return penny;
    }
    public void setPenny(Boolean penny) {
        this.penny = penny;
    }
    public Boolean getCommander() {
        return commander;
    }
    public void setCommander(Boolean commander) {
        this.commander = commander;
    }
    public Boolean getOathbreaker() {
        return oathbreaker;
    }
    public void setOathbreaker(Boolean oathbreaker) {
        this.oathbreaker = oathbreaker;
    }
    public Boolean getStandardbrawl() {
        return standardbrawl;
    }
    public void setStandardbrawl(Boolean standardbrawl) {
        this.standardbrawl = standardbrawl;
    }
    public Boolean getBrawl() {
        return brawl;
    }
    public void setBrawl(Boolean brawl) {
        this.brawl = brawl;
    }
    public Boolean getAlchemy() {
        return alchemy;
    }
    public void setAlchemy(Boolean alchemy) {
        this.alchemy = alchemy;
    }
    public Boolean getPaupercommander() {
        return paupercommander;
    }
    public void setPaupercommander(Boolean paupercommander) {
        this.paupercommander = paupercommander;
    }
    public Boolean getDuel() {
        return duel;
    }
    public void setDuel(Boolean duel) {
        this.duel = duel;
    }
    public Boolean getOldschool() {
        return oldschool;
    }
    public void setOldschool(Boolean oldschool) {
        this.oldschool = oldschool;
    }
    public Boolean getPremodern() {
        return premodern;
    }
    public void setPremodern(Boolean premodern) {
        this.premodern = premodern;
    }
    public Boolean getPredh() {
        return predh;
    }
    public void setPredh(Boolean predh) {
        this.predh = predh;
    }
    public Legalities(){
         standard = false;
         future = false;
         historic = false;
         timeless = false;
         gladiator = false;
         pioneer = false;
         explorer = false;
         modern = false;
         legacy = false;
         pauper = false;
         vintage = false;
         penny = false;
         commander = false;
         oathbreaker = false;
         standardbrawl = false;
         brawl = false;
         alchemy = false;
         paupercommander = false;
         duel = false;
         oldschool = false;
         premodern = false;
         predh = false;
    }
    public Legalities(Map<String,String> legStr){
        standard =  Objects.equals(legStr.get("standard"),("legal"));
        future = Objects.equals(legStr.get("future"),("legal"));
        historic = Objects.equals(legStr.get("historic"),("legal"));
        timeless = Objects.equals(legStr.get("timeless"),("legal"));
        gladiator = Objects.equals(legStr.get("gladiator") ,("legal"));
        pioneer = Objects.equals(legStr.get("pioneer"),("legal"));
        explorer = Objects.equals(legStr.get("explorer"),("legal"));
        modern = Objects.equals(legStr.get("modern"),("legal"));
        legacy = Objects.equals(legStr.get("legacy"),("legal"));
        pauper = Objects.equals(legStr.get("pauper"),("legal"));
        vintage = Objects.equals(legStr.get("vintage"),("legal"));
        penny = Objects.equals(legStr.get("penny"),("legal"));
        commander = Objects.equals(legStr.get("commander"),("legal"));
        oathbreaker = Objects.equals(legStr.get("oathbreaker"),("legal"));
        standardbrawl = Objects.equals(legStr.get("standardbrawl"),("legal"));
        brawl = Objects.equals(legStr.get("brawl"),("legal"));
        alchemy = Objects.equals(legStr.get("alchemy"),("legal"));
        paupercommander = Objects.equals(legStr.get("paupercommander"),("legal"));
        duel = Objects.equals(legStr.get("duel"),("legal"));
        oldschool = Objects.equals(legStr.get("oldschool"),("legal"));
        premodern = Objects.equals(legStr.get("premodern"),("legal"));
        predh = Objects.equals(legStr.get("predh"),("legal"));
    }
    Boolean standard;
    Boolean future;
    Boolean historic;
    Boolean timeless;
    Boolean gladiator;
    Boolean pioneer;
    Boolean explorer;
    Boolean modern;
    Boolean legacy;
    Boolean pauper;
    Boolean vintage;
    Boolean penny;
    Boolean commander;
    Boolean oathbreaker;
    Boolean standardbrawl;
    Boolean brawl;
    Boolean alchemy;
    Boolean paupercommander;
    Boolean duel;
    Boolean oldschool;
    Boolean premodern;
    Boolean predh;

    @Override
    public String toString(){
        return String.format("standard:%s,\nfuture:%s,\nhistoric:%s,\ntimeless:%s,\ngladiator:%s,\npioneer:%s,\nexplorer:%s,\nmodern:%s,\nlegacy:%s,\npauper:%s,\nvintage:%s,\npenny:%s,\ncommander:%s,\noathbreaker:%s,\nstandardbrawl:%s,\nbrawl:%s,\nalchemy:%s,\npaupercommander:%s,\nduel:%s,\noldschool:%s,\npremodern:%s,\npredh:%s"
        ,standard.toString(),future.toString(),historic.toString(),timeless.toString(),gladiator.toString(),pioneer.toString(),explorer.toString(),modern.toString(),legacy.toString(),pauper.toString(),vintage.toString(),penny.toString(),commander.toString(),oathbreaker.toString(),standardbrawl.toString(),brawl.toString(),alchemy.toString(),paupercommander.toString(),duel.toString(),oldschool.toString(),premodern.toString(),predh.toString());
    }
}