package com.likelion.mybatis.design_pattern.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {

    }

    public void performanceFly() {
        flyBehavior.fly();
    }

    public void performanceQuack() {
        quackBehavior.quack();
    }
}
