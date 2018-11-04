package com.israelmesa;

public class Car {

    private int wheels;
    private int steeringWheel;
    private int motor;
    private int seats;
    private int doors;

    public Car(int seats, int doors) {
        this.wheels = 4;
        this.steeringWheel = 1;
        this.motor = 1;
        this.seats = seats;
        this.doors = doors;
    }

    public void move(int speed) {
        System.out.println("Car.move() - Speed: " + speed);
    }

    public void steer(String direction) {
        System.out.println("Car.steer() - Direction: " + direction);
    }

    public int getWheels() {
        return wheels;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public int getMotor() {
        return motor;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }
}
