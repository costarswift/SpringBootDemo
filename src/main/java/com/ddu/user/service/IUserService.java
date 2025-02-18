package com.ddu.user.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.ddu.user.entity.User;

import java.util.List;

public interface IUserService {

    List<User> selectBatchIds(List<Long> ids);
    User getUserById(Long id);
    boolean saveUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(Long id);
}
