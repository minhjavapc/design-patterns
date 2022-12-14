package com.likelion.mybatis.design_pattern.factory;

import com.likelion.mybatis.design_pattern.factory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.name = "New York Style Cheese Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    @Override
    void bake() {

    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
