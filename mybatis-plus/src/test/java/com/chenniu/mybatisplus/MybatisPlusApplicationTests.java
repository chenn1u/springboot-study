package com.chenniu.mybatisplus;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenniu.mybatisplus.entity.User;
import com.chenniu.mybatisplus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Resource
    private IUserService userService;

    @Test
    void testPage() {
        IPage<User> page = new Page<>(1, 2);
        List<User> list = userService.list(page);
        System.out.println(list);
    }

    @Test
    void testInsert() {
        User user = new User();
        user.setUserId(1L);
        user.setEmail("aaa@gmail.com");
        boolean b = userService.updateById(user);
        System.out.println(b);
    }

    @Test
    void testDate() {
        User user = userService.getById(1);
        System.out.println(user.getUpdTime());
        System.out.println(DateUtil.formatDateTime(user.getUpdTime()));
    }

}
