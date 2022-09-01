package com.likelion.mybatis.dto;

public class Server implements Computer {
    @Override
    public String getType() {
        return "Server";
    }
}
