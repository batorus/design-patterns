package com.batorus.designpatterns.DesignPatterns.Decorator.Creatures;

public class Main {
    public static void main(String[] args) {
        Creature troll = new TrollWithHammer(new TrollWithSword( new SimpleTroll()));
        System.out.println("AP: "+troll.getAttackPower());
        troll.attack();
    }
}
