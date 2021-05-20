package com.batorus.designpatterns.DesignPatterns.Decorator.CarDecorator;


public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}