package com.israelmesa;

public class Kitchen {

    private DishWasher dishWasher;
    private Oven oven;
    private Sink sink;

    public Kitchen(DishWasher dishWasher, Oven oven, Sink sink) {
        this.dishWasher = dishWasher;
        this.oven = oven;
        this.sink = sink;
    }

    public void useDishWasher() {
        dishWasher.turnOn();
    }

}
