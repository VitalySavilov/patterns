package strategy.algorithms.implementation;

import strategy.algorithms.api.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
