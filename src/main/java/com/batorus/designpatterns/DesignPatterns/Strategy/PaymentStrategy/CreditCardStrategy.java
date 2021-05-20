package com.batorus.designpatterns.DesignPatterns.Strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

//    private String name;
//    private String cardNumber;
//    private String cvv;
//    private String dateOfExpiry;

    private String pin;

    public CreditCardStrategy(String pin) {
        this.pin = pin;

    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }

}
