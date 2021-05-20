package com.batorus.designpatterns.DesignPatterns.Decorator.Creatures;

public class SimpleTroll implements Creature {

    public SimpleTroll() {
    }

    @Override
    public void attack() {
        System.out.println("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
