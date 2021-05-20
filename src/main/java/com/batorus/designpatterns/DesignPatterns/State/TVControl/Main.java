package com.batorus.designpatterns.DesignPatterns.State.TVControl;

public class Main {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvON = new TVStateON();
        State tvOFF = new TVStateOFF();

        context.setState(tvON);
        context.doAction();


        context.setState(tvOFF);
        context.doAction();

    }
}
