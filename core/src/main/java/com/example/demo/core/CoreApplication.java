package com.example.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class CoreApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CoreApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        ApplicationContext parent = run.getParent();
        String property = environment.getProperty("test.name");
        String error = environment.getProperty("test.error");
        System.out.println();
    }

}
