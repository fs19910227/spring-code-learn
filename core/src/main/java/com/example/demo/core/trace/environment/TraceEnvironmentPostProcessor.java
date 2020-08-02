package com.example.demo.core.trace.environment;

import com.example.demo.core.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * environment post process trace
 *
 * @author zhaofushan
 * @date 2020/7/28 0028 22:30
 */
@Slf4j
public class TraceEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        LogUtil.consoleTrace(this.getClass(), "");
    }
}
