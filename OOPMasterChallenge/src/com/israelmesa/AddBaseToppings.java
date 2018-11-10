package com.israelmesa;

public class AddBaseToppings {

    private boolean lettuce;
    private boolean tomato;
    private boolean onions;
    private boolean cheese;

    public AddBaseToppings(boolean lettuce, boolean tomato, boolean onions, boolean cheese) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onions = onions;
        this.cheese = cheese;
    }

    public double toppingsCost() {

        double toppingPrice = 0;
        if (lettuce) {
            toppingPrice += 0.50;
        }
        if (tomato) {
            toppingPrice += 1.00;
        }
        if (onions) {
            toppingPrice += 0.50;
        }
        if (cheese) {
            toppingPrice += 2.00;
        }
        System.out.println("Total cost of toppings: " + toppingPrice);
        return toppingPrice;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnions() {
        return onions;
    }

    public boolean isCheese() {
        return cheese;
    }
}
