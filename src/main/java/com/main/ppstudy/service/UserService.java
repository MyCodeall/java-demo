package com.main.ppstudy.service;

import com.main.ppstudy.bean.UserBean;
import com.main.ppstudy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required = false)
    UserMapper userMapper;

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(UserBean user){
        return userMapper.addUser(user);
    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    public int deleteUser(UserBean user){
        return userMapper.deleteUser(user);
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    public int updateUser(UserBean user){
        return userMapper.updateUser(user);
    }

    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    public UserBean getUserInfoById(Long id){
        return userMapper.getUserInfoById(id);
    }

    /**
     * 获取用户列表
     * @return
     */
    public List<UserBean> getUserData(){
        return userMapper.getUserData();
    }



}
