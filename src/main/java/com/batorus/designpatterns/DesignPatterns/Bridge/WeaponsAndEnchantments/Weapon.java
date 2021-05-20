package com.batorus.designpatterns.DesignPatterns.Bridge.WeaponsAndEnchantments;

public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}