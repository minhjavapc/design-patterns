package com.likelion.mybatis.design_pattern.factory.factory;

import com.likelion.mybatis.design_pattern.factory.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}