package com.likelion.mybatis.controller;

import com.likelion.mybatis.properties.ValueRefreshConfigBean;
import com.likelion.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DemoController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "/")
    public int getMethod() {
        return personService.countPerson();
    }

    @Autowired
    Environment env;

    @GetMapping(value = "/properties")
    public String properties() {
        return env.getProperty("likelion.coach.name");
    }
}
