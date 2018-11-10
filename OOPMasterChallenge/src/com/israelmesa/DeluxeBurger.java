package com.israelmesa;

public class DeluxeBurger extends BasicBurger{

    private boolean bacon;
    private boolean egg;

    public DeluxeBurger(String name, String meat, String rollType, boolean bacon, boolean egg) {
        super(name, meat, rollType);
        this.bacon = bacon;
        this.egg = egg;
    }

    @Override
    public double price() {
        double deluxeModification = super.price();

        if(bacon) {
            deluxeModification += 3.50;
        }
        if(egg) {
            deluxeModification += 2.00;
        }

        System.out.println("Plus Deluxe Burger Modification: " + deluxeModification);
        return deluxeModification;
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
        return bacon;
    }

    public boolean isEgg() {
        return egg;
    }
}
