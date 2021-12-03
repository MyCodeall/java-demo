package com.main.ppstudy.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.main.ppstudy.bean.UserBean;
import com.main.ppstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 新增用户-params参数方式
     * @param name
     * @param email
     * @param password
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public UserBean addUser(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("nick_name") String nickName){
        UserBean user = new UserBean();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setNickName(nickName);
        userService.addUser(user);
        return user;
    }

    /**
     * 新增用户-JSON参数方式
     * @return
     */
    @RequestMapping(value = "add_json", method = RequestMethod.POST)
    public void addUserJson(@RequestBody JsonObjectSerializer jsonParam){
//        System.out.println(jsonParam.toString());

//        JSONPObject res = new JsonObjectSerializer();
//        res.put

//        return user;
    }





}
