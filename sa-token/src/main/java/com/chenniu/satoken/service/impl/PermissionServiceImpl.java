package com.chenniu.satoken.service.impl;

import com.chenniu.satoken.entity.Permission;
import com.chenniu.satoken.mapper.PermissionMapper;
import com.chenniu.satoken.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionByRoleId(Long roleId) {
        return permissionMapper.queryPermissionByRoleId(roleId);
    }
}
