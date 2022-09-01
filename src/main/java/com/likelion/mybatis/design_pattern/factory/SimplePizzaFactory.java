package com.likelion.mybatis.design_pattern.factory;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
