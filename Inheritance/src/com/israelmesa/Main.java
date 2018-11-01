package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animail", 1, 1, 5, 5);

        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "Silky long");
        dog.eat();
        dog. move();

    }
}
