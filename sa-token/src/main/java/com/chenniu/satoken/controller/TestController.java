package com.chenniu.satoken.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckPermission;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    @SaCheckPermission("user.delete")
    public String test() {
        return "test";
    }

    @GetMapping("/api/login")
    private String login() {
        StpUtil.login(1L);
        return "ok";
    }
}
