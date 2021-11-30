package com.main.ppstudy.service;

import com.main.ppstudy.bean.RoleBean;
import com.main.ppstudy.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    public RoleBean getRoleById(Long id){
        return roleMapper.getRoleById(id);
    }
}
