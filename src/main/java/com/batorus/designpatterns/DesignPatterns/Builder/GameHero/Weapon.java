package com.batorus.designpatterns.DesignPatterns.Builder.GameHero;

public enum Weapon {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}