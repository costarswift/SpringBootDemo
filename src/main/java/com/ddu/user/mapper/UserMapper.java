package com.ddu.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddu.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
