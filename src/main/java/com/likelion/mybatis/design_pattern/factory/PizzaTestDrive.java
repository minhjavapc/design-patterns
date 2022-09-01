package com.likelion.mybatis.design_pattern.factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaShop nyStore = new NYPizzaStore();
        PizzaShop chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
