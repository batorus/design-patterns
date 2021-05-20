package com.batorus.designpatterns.DesignPatterns.Decorator.CarDecorator;

public class LowMaintenanceCar extends CarDecorator {

    public LowMaintenanceCar() {
    }

    public LowMaintenanceCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Low maintenance car.");
    }
}