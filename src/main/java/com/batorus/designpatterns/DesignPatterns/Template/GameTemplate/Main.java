package com.batorus.designpatterns.DesignPatterns.Template.GameTemplate;

public class Main {
    public static void main(String[] args) {
        Game game = new Chess();
        game.play();

        game = new Football();
        game.play();
    }
}
