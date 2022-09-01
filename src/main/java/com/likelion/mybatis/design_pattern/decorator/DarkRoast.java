package com.likelion.mybatis.design_pattern.decorator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DarkRoast extends Beverage{
    @Override
    public double cost() {
        return 0;
    }

    public DarkRoast() {

    }
}
