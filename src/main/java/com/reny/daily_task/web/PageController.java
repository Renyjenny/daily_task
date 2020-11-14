package com.reny.daily_task.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 页面跳转控制
 * @Author: reny
 * @CreateTime: 2020/11/13 16:24
 */
@Controller
public class PageController {

    @GetMapping(value = "/admin")
    public String home() {
        return "redirect:user_task";

    }

    @GetMapping(value = "/user_task")
    public String listTask() {
        return "/userTask";
    }
}
