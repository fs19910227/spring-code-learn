package com.example.demo.dubbo.consumer.service;

import com.example.demo.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaofushan
 * @date 2020/8/5 0005 20:21
 */
@RestController
@RequestMapping("/")
public class ConsumerService {
    @Reference
    private HelloService helloService;

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return helloService.hello(name);
    }

}
