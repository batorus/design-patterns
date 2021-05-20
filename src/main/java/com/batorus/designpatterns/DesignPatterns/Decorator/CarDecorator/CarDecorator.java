package com.batorus.designpatterns.DesignPatterns.Decorator.CarDecorator;

public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator() {
    }

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
