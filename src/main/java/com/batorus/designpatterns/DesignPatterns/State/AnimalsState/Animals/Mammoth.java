package com.batorus.designpatterns.DesignPatterns.State.AnimalsState.Animals;

import DesignPatterns.State.AnimalsState.States.*;

public class Mammoth implements Animal{

    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    /**
     * Makes time pass for the mammoth.
     */
    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
            this.state.onEnterState();
        }

        if (state.getClass().equals(AngryState.class))  {
            changeStateTo(new AttackState(this));
            this.state.onEnterState();
        }

        if (state.getClass().equals(AttackState.class))  {
            changeStateTo(new PeacefulState(this));
            this.state.onEnterState();
        }

        if (state.getClass().equals(HungryState.class))  {
            changeStateTo(new HungryState(this));
            this.state.onEnterState();
        }
    }

    public void changeStateTo(State newState) {
        this.state = newState;
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.state.observe();
    }
}