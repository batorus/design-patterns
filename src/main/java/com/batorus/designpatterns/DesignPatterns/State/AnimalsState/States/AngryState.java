package com.batorus.designpatterns.DesignPatterns.State.AnimalsState.States;

import DesignPatterns.State.AnimalsState.Animals.Animal;

/**
 * Angry state.
 */
public class AngryState implements State {

    private final Animal animal;

    public AngryState(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void observe() {
        System.out.println(animal.toString() + " is furious!");
    }

    @Override
    public void onEnterState() {

        System.out.println(animal.toString() + " acts like he's angry!");
    }

}