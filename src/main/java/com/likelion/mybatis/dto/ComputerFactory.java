package com.likelion.mybatis.dto;

import org.springframework.stereotype.Component;

@Component
public class ComputerFactory {
    public Computer getComputer(String type) {
        if("PC".equalsIgnoreCase(type)) return new PC();
        else if("Server".equalsIgnoreCase(type)) return new Server();
        return null;
    }
}