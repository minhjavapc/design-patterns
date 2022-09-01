package com.likelion.mybatis.design_pattern.factory;

public class NYPizzaStore extends PizzaShop{
    @Override
    Pizza createPizza(String type) {

        if (type.equalsIgnoreCase("cheese")) {
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
