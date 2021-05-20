package com.batorus.designpatterns.DesignPatterns.Strategy.MediaStrategy;

public class InstagramStrategy implements ISocialMediaStrategy {

    public void connectTo(String name) {
        System.out.println("Connecting with " + name + " through Instagram");
    }
}
