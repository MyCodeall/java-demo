package com.main.ppstudy.mapper;

import com.main.ppstudy.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户Mapper定义
 */
@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(UserBean user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    int deleteUser(UserBean user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(UserBean user);

    /**
     * 根据用户ID获取用户信息
     * @param id
     * @return
     */
    UserBean getUserInfoById(Long id);

    /**
     * 获取用户列表数据
     * @return
     */
    List<UserBean> getUserData();
}
