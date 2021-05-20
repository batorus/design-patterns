package com.batorus.designpatterns.DesignPatterns.State.AnimalsState.States;

import DesignPatterns.State.AnimalsState.Animals.Animal;

public class AttackState implements State {

    private final Animal animal;

    public AttackState(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void observe() {
        System.out.println(animal.toString() + " is is furious!");
    }

    @Override
    public void onEnterState() {

        System.out.println(animal.toString() + " gets angry!");
    }

}
