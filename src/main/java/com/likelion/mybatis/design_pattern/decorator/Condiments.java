package com.likelion.mybatis.design_pattern.decorator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Condiments extends Beverage{
    public abstract String getDescription();
}
