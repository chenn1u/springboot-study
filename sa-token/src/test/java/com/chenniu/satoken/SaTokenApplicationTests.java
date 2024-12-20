package com.chenniu.satoken;

import com.chenniu.satoken.entity.Permission;
import com.chenniu.satoken.entity.Role;
import com.chenniu.satoken.mapper.RoleMapper;
import com.chenniu.satoken.service.IPermissionService;
import com.chenniu.satoken.service.IRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class SaTokenApplicationTests {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IPermissionService permissionService;

    @Test
    void contextLoads() {
        List<String> permissionStr = new ArrayList<>();
        List<Role> roles = roleService.getRoleListByUserId(1L);
        for (Role role : roles) {
            List<Permission> permissions = permissionService.getPermissionByRoleId(1L);
            List<String> collect = permissions.stream().map(Permission::getDesc).collect(Collectors.toList());
            permissionStr.addAll(collect);
        }
        System.out.println(permissionStr);
    }

}
