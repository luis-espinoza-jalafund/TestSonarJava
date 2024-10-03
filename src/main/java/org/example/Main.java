package org.example;

import org.example.Animals.Cat;
import org.example.Animals.Dog;
import org.example.Animals.dUCk;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("pepe", 1, true);
        cat.Eat();
        cat.ShowAge();
        cat.isSleep();

        Dog dog = new Dog("Sancho", 3, false);
        dog.Eat();
        dog.ShowAge();
        dog.isHappy();


        dUCk duck;
        duck = new dUCk("q",-2,true);
        duck.Eat();
        duck.ISWaling();
    }
}