package com.reny.daily_task.service;

import com.reny.daily_task.dao.UserDao;
import com.reny.daily_task.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author: reny
 * @CreateTime: 2020/11/13 16:16
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> list() {
        return userDao.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
