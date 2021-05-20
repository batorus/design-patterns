package com.batorus.designpatterns.DesignPatterns.State.AnimalsState.Animals;

import DesignPatterns.State.AnimalsState.States.State;

public interface Animal {
    void observe();
    void changeStateTo(State newState);
    void timePasses();
}
