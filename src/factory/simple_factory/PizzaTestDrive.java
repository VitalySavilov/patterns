package factory.simple_factory;

import factory.simple_factory.pizza.Pizza;
import factory.simple_factory.pizza_simle_factory.SimplePizzaFactory;
import factory.simple_factory.pizza_store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
    }
}
