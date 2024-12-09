package com.chenniu.satoken;

import cn.dev33.satoken.stp.SaLoginConfig;
import cn.dev33.satoken.stp.StpUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SaTokenApplicationTests {

    @Test
    void contextLoads() {
        // 往 jwt 的载荷中添加信息
        StpUtil.login(10001, SaLoginConfig
                .setExtra("name", "zhangsan")
                .setExtra("age", 18)
                .setExtra("role", "超级管理员"));
        System.out.println();
    }

}
