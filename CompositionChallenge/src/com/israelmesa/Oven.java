package com.israelmesa;

public class Oven {

    private String brand;
    private int burners;
    private String color;
    private Dimensions dimensions;

    public Oven(String brand, int burners, String color, Dimensions dimensions) {
        this.brand = brand;
        this.burners = burners;
        this.color = color;
        this.dimensions = dimensions;
    }

    public void turnBurnerOn(int burnerNumber, Temperature temp) {
        System.out.println("Burner " + burnerNumber + " is on at " + temp);
    }

    public void turnOvenOn(Temperature temp) {
        System.out.println("Oven is on at " + temp);
    }

    public String getBrand() {
        return brand;
    }

    public int getBurners() {
        return burners;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
