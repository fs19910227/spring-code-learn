package com.example.demo.core.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Author zhaofushan
 * @Date 2020/7/24 0024 22:18
 */
@RestController
//@RefreshScope
@Slf4j
public class DemoController {
    @Value("${name}")
    String name;

    @GetMapping("/echo")
    public String echo(@RequestParam("content") String content) {
        return content;
    }

    @GetMapping("/name")
    public String name() {
        return name;
    }

}
