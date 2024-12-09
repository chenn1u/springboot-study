package com.chenniu.mybatisplus.mapper;

import com.chenniu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenn1u
 * @since 2024-11-18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
