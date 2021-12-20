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

import java.io.FileNotFoundException;
import java.io.IOException;

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
    public void java() throws FileNotFoundException {
        /*** 1. 定义 ***/
        String s = "123";


        try {
            // ok:
            // file not found:
        } catch (SecurityException e) {
            // no read permission:
            // io error:
        } catch (Exception e) {
            // other error:
        } finally { //可以不写
            // System.out.println("END");
        }


        /*** 2. RuntimeException可以不强制捕获 ***/
        if (s == null){
            throw new NullPointerException("");
        }

        /*** 3. 非RuntimeException必须潜质捕获或者向上抛出 ***/
        String x = null;
        if (x==null) {
            //Alt + Enter
            throw new FileNotFoundException("");
        }

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
//        Integer c = a /b;

        String s = null;
        s.length();



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
        String s = "2";
        String ss = "4";

        String ss1 = "4";

        String ss2 = "4";
        String ss3 = "4";
        throw new ApiException("我出错了00000");
    }

}
