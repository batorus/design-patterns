package com.batorus.designpatterns.DesignPatterns.Strategy.PaymentStrategy;

public class CashStrategy implements PaymentStrategy {

    public CashStrategy(){ }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "$ paid using Cash.");
    }

}