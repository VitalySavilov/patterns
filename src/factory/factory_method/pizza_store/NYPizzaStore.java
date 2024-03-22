package factory.factory_method.pizza_store;

import factory.factory_method.pizza.Pizza;
import factory.factory_method.pizza.ny_style.NYStyleCheesePizza;
import factory.factory_method.pizza.ny_style.NYStyleClamPizza;
import factory.factory_method.pizza.ny_style.NYStylePepperoniPizza;
import factory.factory_method.pizza.ny_style.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
