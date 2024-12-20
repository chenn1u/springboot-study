package com.chenniu.satoken.service;

import com.chenniu.satoken.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
public interface IRoleService extends IService<Role> {

    List<Role> getRoleListByUserId(Long userId);

}
