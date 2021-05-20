package com.batorus.designpatterns.DesignPatterns.State.AnimalsState.States;

import DesignPatterns.State.AnimalsState.Animals.Animal;

public class HungryState implements State {

    private final Animal animal;

    public HungryState(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void observe() {
        System.out.println(animal.toString() + " is hungry! Starts to search for food!");
    }

    @Override
    public void onEnterState() {
        System.out.println(animal.toString() + " gets hungry!");
    }

}