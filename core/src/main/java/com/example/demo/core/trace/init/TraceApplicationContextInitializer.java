package com.example.demo.core.trace.init;

import com.example.demo.core.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * trace application context initializer
 *
 * @author zhaofushan
 * @date 2020/7/26 0026
 */
@Slf4j
public class TraceApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        LogUtil.logTrace(log, this.getClass());
    }

}
