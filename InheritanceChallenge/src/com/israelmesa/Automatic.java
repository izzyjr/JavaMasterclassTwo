package com.israelmesa;

public class Automatic  extends Car{

    public Automatic(int seats, int doors) {
        super(seats, doors);
    }

    @Override
    public void move(int speed) {
        System.out.println("Automatic.move() - Speed: " + speed);
        super.move(speed);
    }

    @Override
    public void steer(String direction) {
        System.out.println("Automatic.steer() - Direction: " + direction);
        super.steer(direction);
    }

}
