package com.chenniu.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenniu.mybatisplus.entity.User;
import com.chenniu.mybatisplus.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenn1u
 * @since 2024-11-18
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Resource
    private IUserService userService;

    @PostMapping("page")
    public IPage<User> page(@RequestBody HashMap<String, Object> params) {
        IPage<User> page = new Page<>((Integer)params.get("current"), (Integer)params.get("size"));
        return userService.page(page, new QueryWrapper<User>());
    }

}
