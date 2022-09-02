package com.likelion.mybatis.design_pattern.facade.composition;

public class DvdPlayer {
    public void on(){

        System.out.println("DvdPlayer on");
    }
    public void off(){

        System.out.println("DvdPlayer off");
    }

    public void display(String movie) {
        System.out.println("DvdPlayer display movie");
    }

    public void stop() {
        System.out.println("DvdPlayer stop");
    }

    public void eject() {
        System.out.println("DvdPlayer eject");
    }
}
