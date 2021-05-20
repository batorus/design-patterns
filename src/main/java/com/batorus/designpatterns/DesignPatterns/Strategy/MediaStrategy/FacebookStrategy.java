package com.batorus.designpatterns.DesignPatterns.Strategy.MediaStrategy;

public class FacebookStrategy implements ISocialMediaStrategy {

    public void connectTo(String name) {
        System.out.println("Connecting with " + name + " through Facebook");
    }
}
