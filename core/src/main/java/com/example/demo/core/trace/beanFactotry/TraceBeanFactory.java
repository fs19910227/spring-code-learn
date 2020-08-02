package com.example.demo.core.trace.beanFactotry;

import com.example.demo.core.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author zhaofushan
 * @date 2020/8/2 0002 23:35
 */
@Component
@Slf4j
public class TraceBeanFactory implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        LogUtil.logTrace(log, this.getClass(), "postProcessBeanFactory");
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        LogUtil.logTrace(log, this.getClass(), "postProcessBeanDefinitionRegistry");

    }
}
