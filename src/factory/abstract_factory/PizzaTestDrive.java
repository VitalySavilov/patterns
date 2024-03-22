package factory.abstract_factory;

import factory.abstract_factory.pizza.Pizza;
import factory.abstract_factory.pizza_store.ChicagoPizzaStore;
import factory.abstract_factory.pizza_store.NYPizzaStore;
import factory.abstract_factory.pizza_store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza);

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza);

        pizza = nyStore.orderPizza("clam");
        System.out.println("We ordered a " + pizza);

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("We ordered a " + pizza);

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("We ordered a " + pizza);

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("We ordered a " + pizza);

        pizza = nyStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza);

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza);
    }
}
