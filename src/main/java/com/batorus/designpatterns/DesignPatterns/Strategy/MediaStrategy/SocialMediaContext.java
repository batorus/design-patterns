package com.batorus.designpatterns.DesignPatterns.Strategy.MediaStrategy;

public class SocialMediaContext {
    ISocialMediaStrategy smStrategy;

    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) {
        this.smStrategy = smStrategy;
    }

    public void connect(String name) {
        smStrategy.connectTo(name);
    }
}

