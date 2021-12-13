package com.main.ppstudy.controller;

import com.main.ppstudy.bean.UserBean;
import com.main.ppstudy.exception.ApiException;
import com.main.ppstudy.exception.ExceptionResult;
import com.main.ppstudy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @Autowired
    UserService userService;

    //获取Logger实例
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * JAVA原生异常
     */
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    public void java(){


    }


    /**
     * 【springboot-全局异常捕获】捕获普通异常
     * @param user
     * @return
     */
    @RequestMapping(value = "/normal", method = RequestMethod.GET)
    public UserBean normal(@RequestBody UserBean user){
        Integer a = 10;
        Integer b = 0;
        /*** 1. 发生异常自动捕获：“【全局异常捕获】发生了异常（MyExceptionHandler）java.lang.ArithmeticException: / by zero” ***/
        Integer c = a /b;

        /*** 2. 抛出普通异常，自动捕获 ***/
        throw new RuntimeException("抛出普通异常");

//        return user;
    }

    /**
     * 【springboot-全局异常捕获】捕获自定义异常
     * @return
     */
    @RequestMapping(value = "/define", method = RequestMethod.GET)
    public ExceptionResult define(){
        throw new ApiException("我出错了");
    }

}
