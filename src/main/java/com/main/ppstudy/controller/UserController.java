package com.main.ppstudy.controller;

import com.main.ppstudy.bean.UserBean;
import com.main.ppstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 新增用户
     * @param name
     * @param email
     * @param password
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public UserBean addUser(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password){
        UserBean user = new UserBean();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        userService.addUser(user);
        return user;
    }
}
