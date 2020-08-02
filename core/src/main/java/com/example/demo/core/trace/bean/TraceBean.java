package com.example.demo.core.trace.bean;

import com.example.demo.core.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author zhaofushan
 * @date 2020/8/2 0002 23:34
 */
@Component
@Slf4j
public class TraceBean implements BeanPostProcessor, SmartInitializingSingleton {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LogUtil.logTrace(log, this.getClass(), "postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LogUtil.logTrace(log, this.getClass(), "postProcessBeforeInitialization");
        return null;
    }

    @Override
    public void afterSingletonsInstantiated() {
        LogUtil.logTrace(log, this.getClass(), "postProcessBeforeInitialization");
    }
}
