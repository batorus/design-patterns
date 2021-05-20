package com.batorus.designpatterns.DesignPatterns.Template.GameTemplate;

public class Chess extends Game {

    @Override
    void initializeGame() {
        System.out.println(this.getClass() + " initialize Game!");
    }

    @Override
    void playGame() {
        System.out.println(this.getClass() + " play Game!");
    }

    @Override
    void endGame() {
        System.out.println(this.getClass() + " end Game!");
    }
}
