package com.chenniu.satoken.service.impl;

import com.chenniu.satoken.entity.Role;
import com.chenniu.satoken.mapper.RoleMapper;
import com.chenniu.satoken.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleListByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }
}
