package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Dimensions dishWasherDimensions = new Dimensions(24, 24, 24);
        DishWasher theDishWasher = new DishWasher("Samsung", "Silver", dishWasherDimensions);

        Dimensions ovenDimensions = new Dimensions(30, 30 , 30 );
        Oven theOven = new Oven("Whirlpool", 4, "Black", ovenDimensions);

        Sink theSink = new Sink("Kohler", "Stainless Steel", 2);

        Kitchen theKitchen = new Kitchen(theDishWasher, theOven, theSink);

        theKitchen.useDishWasher();

    }
}
