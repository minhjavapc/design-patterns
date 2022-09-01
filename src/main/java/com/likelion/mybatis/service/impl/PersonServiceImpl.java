package com.likelion.mybatis.service.impl;

import com.likelion.mybatis.repository.PersonRepository;
import com.likelion.mybatis.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonRepository personRepository;

    @Override
    public int countPerson() {
        return personRepository.count();
    }
}
