package com.chenniu.satoken.mapper;

import com.chenniu.satoken.entity.RolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户权限关联表 Mapper 接口
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

}
