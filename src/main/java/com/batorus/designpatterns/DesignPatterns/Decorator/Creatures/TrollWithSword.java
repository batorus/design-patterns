package com.batorus.designpatterns.DesignPatterns.Decorator.Creatures;

public class TrollWithSword implements Creature {

    private final Creature creatureToDecorate;

    public TrollWithSword(Creature creatureToDecorate) {
        this.creatureToDecorate = creatureToDecorate;
    }

    @Override
    public void attack() {
        creatureToDecorate.attack();
        System.out.println("The troll attacks with sword!");
    }

    @Override
    public int getAttackPower() {
        return creatureToDecorate.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        creatureToDecorate.fleeBattle();
    }
}