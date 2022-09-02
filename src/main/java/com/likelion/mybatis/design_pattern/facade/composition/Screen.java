package com.likelion.mybatis.design_pattern.facade.composition;

public class Screen {
    public void on(){

        System.out.println("Screen on");
    }
    public void off(){
        System.out.println("Screen off");

    }

    public void down() {
        System.out.println("Screen down");
    }

    public void up() {
        System.out.println("Screen up");
    }
}
