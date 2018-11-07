package com.israelmesa;

public class DishWasher {

    private String brand;
    private String color;
    private Dimensions dimensions;

    public DishWasher(String brand, String color, Dimensions dimensions) {
        this.brand = brand;
        this.color = color;
        this.dimensions = dimensions;
    }

    public void turnOn() {
        System.out.println("Washing dishes...");
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
