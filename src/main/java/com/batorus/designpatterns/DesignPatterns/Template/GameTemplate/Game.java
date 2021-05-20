package com.batorus.designpatterns.DesignPatterns.Template.GameTemplate;

public abstract class Game {

    abstract void initializeGame();

    abstract void playGame();

    abstract void endGame();

    //template method
    public final void play() {
        initializeGame();
        playGame();
        endGame();
    }
}
