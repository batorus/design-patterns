package com.batorus.designpatterns.DesignPatterns.Decorator.Creatures;

public class TrollWithHammer implements Creature {

    private final Creature creatureToDecorate;

    public TrollWithHammer(Creature creatureToDecorate) {
        this.creatureToDecorate = creatureToDecorate;
    }

    @Override
    public void attack() {
        creatureToDecorate.attack();
        System.out.println("The troll attacks with hammer!");
    }

    @Override
    public int getAttackPower() {
        return creatureToDecorate.getAttackPower() + 20;
    }

    @Override
    public void fleeBattle() {
        creatureToDecorate.fleeBattle();
    }
}