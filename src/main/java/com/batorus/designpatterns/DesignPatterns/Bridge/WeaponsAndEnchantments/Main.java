package com.batorus.designpatterns.DesignPatterns.Bridge.WeaponsAndEnchantments;

public class Main {

    public static void main(String[] args) {
        System.out.println("The knight receives an enchanted sword.");
        Weapon enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        System.out.println("The valkyrie receives an enchanted hammer.");
        Weapon hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}