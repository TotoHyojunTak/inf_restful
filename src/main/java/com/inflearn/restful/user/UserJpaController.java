package com.inflearn.restful.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//JPA Service 구현을 위한 Controller, Repository 생성

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

    @Autowired
    private UserRepository userRepository;

    // curl http://localhost:8088/jpa/users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userRepository.findAll();
    }


}
