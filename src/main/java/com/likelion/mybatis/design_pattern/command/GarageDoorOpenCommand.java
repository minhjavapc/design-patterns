package com.likelion.mybatis.design_pattern.command;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor= garageDoor;
    }

    @Override
    public void excute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }

    @Override
    public void store() {

    }

    @Override
    public void load() {

    }
}
