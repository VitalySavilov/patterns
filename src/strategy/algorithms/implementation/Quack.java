package strategy.algorithms.implementation;

import strategy.algorithms.api.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
