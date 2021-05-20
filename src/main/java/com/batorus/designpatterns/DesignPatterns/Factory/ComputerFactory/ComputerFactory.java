package com.batorus.designpatterns.DesignPatterns.Factory.ComputerFactory;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {

        if ("PC".equalsIgnoreCase(type)){
            return new PC.Builder()
                        .withCPU(cpu)
                        .withHDD(hdd)
                        .withRam(ram)
                        .build();
        }

        else if ("Server".equalsIgnoreCase(type))
            return new Server.Builder()
                        .withCPU(cpu)
                        .withHDD(hdd)
                        .withRam(ram)
                        .build();

        return null;
    }
}
