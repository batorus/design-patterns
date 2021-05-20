package com.batorus.designpatterns.DesignPatterns.Factory.ComputerFactory;


public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(Builder builder) {
        this.ram = builder.getRam();
        this.hdd = builder.getHdd();
        this.cpu = builder.getCpu();
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    public static class Builder {

        private String ram;
        private String hdd;
        private String cpu;

        public Builder() {
        }

        public Builder withRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder withHDD(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder withCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public String getRam() {
            return ram;
        }

        public String getHdd() {
            return hdd;
        }

        public String getCpu() {
            return cpu;
        }

        public Server build() {

            return new Server(this);
        }
    }
}