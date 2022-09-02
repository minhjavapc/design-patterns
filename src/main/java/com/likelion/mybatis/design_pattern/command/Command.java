package com.likelion.mybatis.design_pattern.command;

public interface Command {
    void excute();
    void undo();
    // Logging
    void store();
    void load();
}
