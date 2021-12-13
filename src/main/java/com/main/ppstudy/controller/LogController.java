package com.main.ppstudy.controller;

import com.main.ppstudy.bean.UserBean;
import com.main.ppstudy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    UserService userService;

    //获取Logger实例
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 新增日志
     * @param name
     * @param email
     * @param password
     * @return
     */
    @RequestMapping(value = "/add_logs", method = RequestMethod.POST)
    public UserBean addLogs(@RequestBody UserBean user){
        logger.debug("用户名称："+user.getName());
        logger.info("用户名称："+user.getName());
        logger.warn("用户名称："+user.getName());
        logger.error("用户名称："+user.getName());
        return user;
    }

}
