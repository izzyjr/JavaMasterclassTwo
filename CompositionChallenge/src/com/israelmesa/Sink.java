package com.israelmesa;

public class Sink {

    private String brand;
    private String material;
    private int bowls;

    public Sink(String brand, String material, int bowls) {
        this.brand = brand;
        this.material = material;
        this.bowls = bowls;
    }

    public void onHotWater() {
        System.out.println("Hot water running...");
    }

    public void onColdWater() {
        System.out.println("Cold water running...");
    }

    public void waterOff() {
        System.out.println("Water off.");
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public int getBowls() {
        return bowls;
    }
}
