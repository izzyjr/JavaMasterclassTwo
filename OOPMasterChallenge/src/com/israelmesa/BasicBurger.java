package com.israelmesa;

public class BasicBurger {

    private String name;
    private String meat;
    private String rollType;
    private AddBaseToppings toppings;
    private double price = 5.00;

    public BasicBurger(String name, String meat, String rollType, AddBaseToppings toppings) {
        this.name = name;
        this.meat = meat;
        this.rollType = rollType;
        this.toppings = toppings;
        this.price = price;
    }


    public BasicBurger(String name, String meat, String rollType) {
        this.name = name;
        this.meat = meat;
        this.rollType = rollType;
        this.price = price;
    }

    public double price() {

        double finalPrice = getPrice();
        System.out.println("Basic Burger price: " + finalPrice);
        return finalPrice;
    }

    public void finalBasicBurgerPrice() {
        double finalPrice = getPrice() + getToppings().toppingsCost();
        System.out.println("Basic Burger price + Toppings: " + finalPrice);
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getRollType() {
        return rollType;
    }

    public AddBaseToppings getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }
}
