package com.israelmesa;

public class Manual extends Car {

    private int gear;

    public Manual(int seats, int doors, int gear) {
        super(seats, doors);
        this.gear = gear;
    }

    @Override
    public void move(int speed) {
        System.out.println("Manual.move() - Speed: " + speed);
        super.move(speed);
    }

    @Override
    public void steer(String direction) {
        System.out.println("Manual.steer() - Direction: " + direction);
        super.steer(direction);
    }

    public int getGear() {
        return gear;
    }
}
