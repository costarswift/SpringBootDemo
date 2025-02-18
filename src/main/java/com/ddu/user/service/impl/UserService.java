package com.ddu.user.service.impl;

import com.ddu.user.entity.User;
import com.ddu.user.mapper.UserMapper;
import com.ddu.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectBatchIds(List<Long> ids) {
        return userMapper.selectBatchIds(ids);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public boolean saveUser(User user) {
        user.setDeleteFlag("N");
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateById(user) > 0;
    }

    @Override
    public boolean deleteUser(Long id) {
        User user = userMapper.selectById(id);
        user.setDeleteFlag("Y");
        return userMapper.updateById(user) > 0;
    }
}
