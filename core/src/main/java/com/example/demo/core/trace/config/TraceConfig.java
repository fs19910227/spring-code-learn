package com.example.demo.core.trace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaofushan
 * @date 2020/7/31 0031 22:49
 */
@Configuration
public class TraceConfig {
    @Bean
    public Trace trace() {
        return new Trace();
    }
}
