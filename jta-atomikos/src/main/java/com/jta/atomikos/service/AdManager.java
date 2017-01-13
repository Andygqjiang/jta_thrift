package com.jta.atomikos.service;

import com.jta.atomikos.dao.AdDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/15 0015.
 */
@Service
public class AdManager {

    @Inject
    private AdDao adDao;


}
