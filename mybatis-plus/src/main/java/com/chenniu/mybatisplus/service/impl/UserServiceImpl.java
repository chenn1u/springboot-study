package com.chenniu.mybatisplus.service.impl;

import com.chenniu.mybatisplus.entity.User;
import com.chenniu.mybatisplus.mapper.UserMapper;
import com.chenniu.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenn1u
 * @since 2024-11-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
