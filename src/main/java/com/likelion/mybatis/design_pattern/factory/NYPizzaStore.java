package com.likelion.mybatis.design_pattern.factory;

import com.likelion.mybatis.design_pattern.factory.factory.NYPizzaIngredientFactory;
import com.likelion.mybatis.design_pattern.factory.factory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}