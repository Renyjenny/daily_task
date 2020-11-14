package com.reny.daily_task.dao;

import com.reny.daily_task.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: TODO
 * @Author: reny
 * @CreateTime: 2020/11/13 15:59
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
