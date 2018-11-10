package com.israelmesa;

public class HealthyBurger extends BasicBurger{

    private boolean avocado;
    private boolean spinach;

    public HealthyBurger(String name, String meat, String rollType, AddBaseToppings toppings, boolean avocado, boolean spinach) {
        super(name, meat, rollType, toppings);
        this.avocado = avocado;
        this.spinach = spinach;
    }

    @Override
    public double price() {
        double healthyModification = super.price() + getToppings().toppingsCost();

        if(avocado) {
            healthyModification += 3.00;
        }
        if(spinach) {
            healthyModification += 1.00;
        }

        System.out.println("Plus Healthy Burger Modification: " + healthyModification);
        return healthyModification;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getMeat() {
        return super.getMeat();
    }

    @Override
    public String getRollType() {
        return super.getRollType();
    }

    @Override
    public AddBaseToppings getToppings() {
        return super.getToppings();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public boolean isAvocado() {
        return avocado;
    }

    public boolean isSpinach() {
        return spinach;
    }
}
