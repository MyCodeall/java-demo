package com.main.ppstudy.mapper;

import com.main.ppstudy.bean.RoleBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author
 */
@Mapper
public interface RoleMapper {
    // @Select("select * form roles where id = #{id}")
    RoleBean getRoleById(Long id);
//    int addRole(Role role);
}
