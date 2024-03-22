package strategy.duck;

import strategy.algorithms.implementation.FlyWithWings;
import strategy.algorithms.implementation.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real mallard duck");
    }

}
