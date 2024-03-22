package factory.factory_method;

import factory.factory_method.pizza.Pizza;
import factory.factory_method.pizza_store.ChicagoPizzaStore;
import factory.factory_method.pizza_store.NYPizzaStore;
import factory.factory_method.pizza_store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());

        pizza = nyStore.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName());

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("We ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("We ordered a " + pizza.getName());

        pizza = nyStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());
    }
}
