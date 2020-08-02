package com.example.demo.core.trace.listener;

import com.example.demo.core.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * trace run listener
 *
 * @author zhaofushan
 * @date 2020/7/26 0026 1:57
 */
@Slf4j
public class TraceApplicationRunListener implements SpringApplicationRunListener {
    private final SpringApplication application;

    private final String[] args;

    public TraceApplicationRunListener(SpringApplication application, String[] args) {
        this.application = application;
        this.args = args;

    }

    @Override
    public void starting() {
        LogUtil.consoleTrace(this.getClass(), "stage is starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

        LogUtil.consoleTrace(this.getClass(), "stage is environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

        LogUtil.consoleTrace(this.getClass(), "stage is contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

        LogUtil.consoleTrace(this.getClass(), "stage is contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {

        LogUtil.consoleTrace(this.getClass(), "stage is started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {

        LogUtil.consoleTrace(this.getClass(), "stage is running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

        LogUtil.consoleTrace(this.getClass(), "stage is failed");
    }

}
