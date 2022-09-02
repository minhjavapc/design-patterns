package com.likelion.mybatis.design_pattern.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}