package com.provider.service.impl;

import com.api.service.IHelloService;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2018-11-30 18:18
 * @email: lhuanjie@qq.com
 */
public class HelloServiceImpl implements IHelloService {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
