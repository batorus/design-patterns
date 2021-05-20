package com.batorus.designpatterns.DesignPatterns.State.AnimalsState.States;

import DesignPatterns.State.AnimalsState.Animals.Animal;

/**
 * Peaceful state.
 */
public class PeacefulState implements State {

    private final Animal animal;

    public PeacefulState(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void observe() {
        // LOGGER.info("{} is calm and peaceful.", mammoth);
        System.out.println(animal.toString() + " is calm and peaceful!");
    }

    @Override
    public void onEnterState() {
        System.out.println(animal.toString() + " calms down.");
    }

}