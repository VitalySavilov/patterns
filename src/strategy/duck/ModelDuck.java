package strategy.duck;

import strategy.algorithms.implementation.FlyNoWay;
import strategy.algorithms.implementation.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }

}
