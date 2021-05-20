package com.batorus.designpatterns.DesignPatterns.Decorator.CarDecorator;

public class Main {
    public static void main(String[] args) {

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n********************");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

        System.out.println("\n**************");
        Car lowMaintenanceCar = new LowMaintenanceCar(new SportsCar(new LuxuryCar(new BasicCar())));
        lowMaintenanceCar.assemble();
    }
}
