package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Manual manual = new Manual(2,2,3);
        manual.move(20);
        manual.steer("right");

        System.out.println("Gear: " + manual.getGear());

        Automatic automatic = new Automatic(2,2);
        automatic.move(20);
        automatic.steer("right");

        System.out.println("Number of seats: " + automatic.getSeats());

    }
}
