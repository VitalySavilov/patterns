package strategy.algorithms.implementation;

import strategy.algorithms.api.FlyBehavior;

public class FlyRockedPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying wit a rocket!");
    }

}
