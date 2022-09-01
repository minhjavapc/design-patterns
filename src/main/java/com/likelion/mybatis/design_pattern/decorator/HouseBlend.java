package com.likelion.mybatis.design_pattern.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
