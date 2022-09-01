package com.likelion.mybatis.design_pattern.strategy;

public class MallardDuck extends Duck {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performanceQuack();
    }

    public MallardDuck() {
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard Duck!");
    }
}
