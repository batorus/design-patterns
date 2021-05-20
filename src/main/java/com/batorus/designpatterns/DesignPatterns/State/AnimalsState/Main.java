package com.batorus.designpatterns.DesignPatterns.State.AnimalsState;

import DesignPatterns.State.AnimalsState.Animals.Animal;
import DesignPatterns.State.AnimalsState.Animals.Mammoth;
import DesignPatterns.State.AnimalsState.States.AttackState;
import DesignPatterns.State.AnimalsState.States.HungryState;

public class Main {
    /**
     * Program entry point.
     */
    public static void main(String[] args) {

        Animal mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.changeStateTo(new HungryState(mammoth));
        mammoth.observe();

        mammoth.changeStateTo(new AttackState(mammoth));
        mammoth.observe();

    }
}
