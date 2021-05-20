package com.batorus.designpatterns.DesignPatterns.Builder.GameHero;

public enum Profession {

    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}