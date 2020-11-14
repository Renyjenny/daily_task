package com.reny.daily_task.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 异常处理
 * @Author: reny
 * @CreateTime: 2020/11/13 17:38
 */
@RestController
@ControllerAdvice
public class GloabalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws ClassNotFoundException {
        e.printStackTrace();
        Class constraintViolationException = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if (null != e.getCause() && constraintViolationException == e.getCause().getClass()) {
            return "违反约束，外键约束";
        }
        return e.getMessage();
    }
}
