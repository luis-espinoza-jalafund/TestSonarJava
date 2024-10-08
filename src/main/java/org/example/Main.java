package org.example;

import org.example.Animals.Cat;
import org.example.Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("pepe", 1, true);
        cat.Eat();
        cat.ShowAge();
        System.out.println(cat.isSleep());

        Dog dog = new Dog("Sancho", 3, false);
        dog.Eat();
        dog.ShowAge();
        dog.isHappy();
    }
}