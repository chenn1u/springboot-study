package com.chenniu.satoken.mapper;

import com.chenniu.satoken.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    @Select("select r.* from role r left join test.user_role ur on r.id = ur.role_id left join test.user u on ur.user_id = u.id where u.id = #{userId}")
    List<Role> selectRolesByUserId(Long userId);
}
