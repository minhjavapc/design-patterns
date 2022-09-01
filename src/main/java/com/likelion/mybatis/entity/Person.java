package com.likelion.mybatis.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private Long id;
    private String fullName;
    private Date dateOfBirth;
}
