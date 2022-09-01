package com.likelion.mybatis.design_pattern.decorator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffe";
    }

    @Override
    public double cost() {
        return 2;
    }
}
