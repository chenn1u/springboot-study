package com.chenniu.satoken.service.impl;

import com.chenniu.satoken.entity.User;
import com.chenniu.satoken.mapper.UserMapper;
import com.chenniu.satoken.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
