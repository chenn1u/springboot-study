package com.chenniu.satoken.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenniu.satoken.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

    @Select("select p.* from permission p left join test.role_permission rp on p.id = rp.permission_id left join test.role r on rp.role_id = r.id where r.id = #{roleId}")
    List<Permission> queryPermissionByRoleId(Long roleId);

}
