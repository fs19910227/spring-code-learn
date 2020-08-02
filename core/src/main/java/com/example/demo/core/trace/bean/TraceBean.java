package com.example.demo.core.trace.bean;

import com.example.demo.core.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author zhaofushan
 * @date 2020/8/2 0002 23:34
 */
@Component
@Slf4j
public class TraceBean implements BeanPostProcessor,
        InitializingBean,
        SmartInitializingSingleton, ApplicationContextAware {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LogUtil.logTrace(log, this.getClass(), "beforeInitialization,beanName is {}", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LogUtil.logTrace(log, this.getClass(), "afterInitialization,beanName is {}", beanName);
        return bean;
    }

    @Override
    public void afterSingletonsInstantiated() {
        LogUtil.logTrace(log, this.getClass(), "postProcessBeforeInitialization");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LogUtil.logTrace(log, this.getClass(), "InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LogUtil.logTrace(log, this.getClass(), "aware ApplicationContext");

    }
}
