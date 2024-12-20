package com.chenniu.satoken.service;

import com.chenniu.satoken.entity.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
public interface IPermissionService extends IService<Permission> {

    List<Permission> getPermissionByRoleId(Long roleId);

}
