package com.main.ppstudy.controller;

import com.main.ppstudy.bean.RoleBean;
import com.main.ppstudy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RoleBean getAllRole(@PathVariable Long id){
        return roleService.getRoleById(id);
    }
}
