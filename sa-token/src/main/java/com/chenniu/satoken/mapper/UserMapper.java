package com.chenniu.satoken.mapper;

import com.chenniu.satoken.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author chenniu
 * @since 2024-12-20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
