package com.example.demo.dubbo.provider.service;

import com.example.demo.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zhaofushan
 * @date 2020/8/5 0005 20:13
 */
@Service
public class DemoService implements HelloService {
    @Override
    public String hello(String name) {
        return "hello" + name;
    }
}
