package com.likelion.mybatis.design_pattern.command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    @Override
    public void store() {

    }

    @Override
    public void load() {

    }
}
