package com.israelmesa;

class Car {

    private String brandName;
    private int cylinders;
    private int wheels = 4;
    private boolean engine = true;

    public Car(String brandName, int cylinders) {
        this.brandName = brandName;
        this.cylinders = cylinders;
    }

    public void startEngine() {
        System.out.println("Car.startedEngine() - Engine started...");
    }

    public void accelerate(int mph) {
        System.out.println("Car.accelerate() - accelerated to " + mph + " mph");
    }

    public void brake() {
        System.out.println("Car.brake() - car has braked to 0 mph");
    }

    public String getBrandName() {
        return brandName;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Outback extends Car{

    public Outback(String brandName, int cylinders) {
        super(brandName, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Outback.startEngine() called");
    }

    @Override
    public void accelerate(int mph) {
        System.out.println("Outback.accelerate() called");
    }

    @Override
    public void brake() {
        System.out.println("Outback.brake() called");
    }

    @Override
    public String getBrandName() {
        return super.getBrandName();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public boolean isEngine() {
        return super.isEngine();
    }
}

class ElCamino extends Car{

    public ElCamino(String brandName, int cylinders) {
        super(brandName, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("ElCamino.startEngine() called");
    }

    @Override
    public void accelerate(int mph) {
        System.out.println("ElCamino.accelerate() called");
    }

    @Override
    public void brake() {
        System.out.println("ElCamino.brake() called");
    }

    @Override
    public String getBrandName() {
        return super.getBrandName();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public boolean isEngine() {
        return super.isEngine();
    }
}


public class Main {

    public static void main(String[] args) {

        Outback outback = new Outback("Subaru", 4);
        System.out.println("Brand: " + outback.getBrandName() + "\n" +
                            "Cylinders: " + outback.getCylinders() + "\n" +
                            "Wheels: " + outback.getWheels() + "\n" +
                            "Engine: " + outback.isEngine());
        outback.startEngine();
        outback.accelerate(120);
        outback.brake();

        System.out.println("//.............................................//");

        ElCamino elCamino = new ElCamino("Ford", 8);
        System.out.println("Brand: " + elCamino.getBrandName() + "\n" +
                "Cylinders: " + elCamino.getCylinders() + "\n" +
                "Wheels: " + elCamino.getWheels() + "\n" +
                "Engine: " + elCamino.isEngine());
        elCamino.startEngine();
        elCamino.accelerate(120);
        elCamino.brake();

    }
}
