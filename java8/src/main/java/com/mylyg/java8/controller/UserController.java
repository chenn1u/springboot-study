package com.mylyg.java8.controller;

import com.mylyg.java8.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class UserController {
    @PostMapping("/test")
    public String test(@RequestBody @Validated User user) {
        return "test";
    }
}
