package com.likelion.mybatis.design_pattern.decorator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Beverage {
    String description = "Unknown Beverage";
    public abstract double cost();
}
