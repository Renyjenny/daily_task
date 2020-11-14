package com.reny.daily_task.web;

import com.reny.daily_task.pojo.User;
import com.reny.daily_task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TODO
 * @Author: reny
 * @CreateTime: 2020/11/13 16:36
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> list() {
        return userService.list();
    }
}
