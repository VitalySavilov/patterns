package factory.factory_method.pizza_store;

import factory.factory_method.pizza.Pizza;
import factory.factory_method.pizza.chicago_style.ChicagoStyleCheesePizza;
import factory.factory_method.pizza.chicago_style.ChicagoStyleClamPizza;
import factory.factory_method.pizza.chicago_style.ChicagoStylePepperoniPizza;
import factory.factory_method.pizza.chicago_style.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
