package com.thrift.demo;

import org.apache.thrift.TException;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class HelloWorldImpl implements HelloWorldService.Iface {

    @Override
    public String sayHello(String username) throws TException {
        return "Hi," + username + " welcome to my blog www.micmiu.com";
    }
}
