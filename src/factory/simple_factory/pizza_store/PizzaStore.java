package factory.simple_factory.pizza_store;

import factory.simple_factory.pizza.Pizza;
import factory.simple_factory.pizza_simle_factory.SimplePizzaFactory;

public class PizzaStore {
    private final SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
