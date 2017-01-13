package com.jta.atomikos.controller;

import com.jta.atomikos.service.SysUserManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Inject
    private SysUserManager sysUserManager;

    @RequestMapping(method = RequestMethod.GET)
    public void save() {
        sysUserManager.save();
    }
}
