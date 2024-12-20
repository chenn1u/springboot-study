package com.chenniu.satoken.common.satoken;

import cn.dev33.satoken.stp.StpInterface;
import cn.hutool.core.convert.Convert;
import com.chenniu.satoken.entity.Permission;
import com.chenniu.satoken.entity.Role;
import com.chenniu.satoken.service.IPermissionService;
import com.chenniu.satoken.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 自定义权限加载接口实现类
 */
@Component
public class StpInterfaceImpl implements StpInterface {
    @Autowired
    private IRoleService roleService;

    @Autowired
    private IPermissionService permissionService;

    /**
     * 获取用户权限列表
     * @param o
     * @param s
     * @return
     */
    @Override
    public List<String> getPermissionList(Object o, String s) {
        List<String> permissionStr = new ArrayList<>();
        List<Role> roles = roleService.getRoleListByUserId(Convert.toLong(o));
        for (Role role : roles) {
            List<Permission> permissions = permissionService.getPermissionByRoleId(role.getId());
            List<String> collect = permissions.stream().map(Permission::getDesc).collect(Collectors.toList());
            permissionStr.addAll(collect);
        }
        return permissionStr;
    }

    /**
     * 获取用户角色列表
     * @param o
     * @param s
     * @return
     */
    @Override
    public List<String> getRoleList(Object o, String s) {
        List<Role> roles = roleService.getRoleListByUserId((Convert.toLong(o)));
        return roles.stream().map(Role::getName).collect(Collectors.toList());
    }
}
