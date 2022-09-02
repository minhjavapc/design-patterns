package com.likelion.mybatis.design_pattern.facade.composition;

public class Amplifier {
    public void on(){
        System.out.println("Amplifier on");
    }
    public void off(){
        System.out.println("Amplifier off");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier dvd");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setSurroundSound");
    }

    public void setVolume(int i) {
        System.out.println("Amplifier setVolume");
    }
}