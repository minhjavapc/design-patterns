package com.likelion.mybatis.dto;

public class PC implements Computer {
    @Override
    public String getType() {
        return "PC";
    }
}
