package com.jta.atomikos.service;

import com.jta.atomikos.dao.AdDao;
import com.jta.atomikos.dao.SysUserDao;
import com.jta.atomikos.model.Ad;
import com.jta.atomikos.model.SysUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/15 0015.
 */
@Service
public class SysUserManager {

    @Inject
    private SysUserDao sysUserDao;

    @Inject
    private AdDao adDao;

    @Transactional
    public void save() {
        Ad ad = new Ad();
        ad.setIconPath("12345");
        ad.setUrlLink("www.baidu.com");

        SysUser user = new SysUser();
        user.setName("Andy");
        user.setAccount("123456");
        user.setPassword("123456");
        user.setImAccount("123456");
        user.setUserType("1");
        user.setSex("1");
        sysUserDao.save(user);
        adDao.save(ad);
    }
}
