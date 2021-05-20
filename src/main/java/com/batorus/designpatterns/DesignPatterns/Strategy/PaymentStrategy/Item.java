package com.batorus.designpatterns.DesignPatterns.Strategy.PaymentStrategy;

public class Item {

    String itemType;
    private String upcCode;
    private int price;

    public Item(String itemType, String upc, int cost) {
        this.upcCode = upc;
        this.price = cost;
        this.itemType = itemType;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

    public String getItemType() {
        return itemType;
    }
}