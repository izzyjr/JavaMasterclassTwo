package com.israelmesa;

public class Main {

    public static void main(String[] args) {


        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger", "Beef", "Rye",
                                        new AddBaseToppings(false, true, true, true), true, true);
        System.out.println("Burger: " + healthyBurger.getName());
        healthyBurger.price();

        System.out.println("*************************************************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", "Beef", "Rye", true, true);
        System.out.println("Burger: " + deluxeBurger.getName());
        deluxeBurger.price();

        System.out.println("*************************************************************");

        BasicBurger basicBurger = new BasicBurger("Basic Burger", "Beef", "Rye",
                new AddBaseToppings(true, false, true, true));
        System.out.println("Burger: " + basicBurger.getName());
        basicBurger.finalBasicBurgerPrice();
    }
}
