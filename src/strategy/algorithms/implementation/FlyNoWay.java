package strategy.algorithms.implementation;

import strategy.algorithms.api.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
