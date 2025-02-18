package com.ddu.user.controller;

import com.ddu.user.entity.User;
import com.ddu.user.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/findUserList")
    public List<User> selectBatchIds(@RequestBody List<Long> ids) {
        return userService.selectBatchIds(ids);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/saveUser")
    public boolean saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("updateUser")
    public boolean updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
