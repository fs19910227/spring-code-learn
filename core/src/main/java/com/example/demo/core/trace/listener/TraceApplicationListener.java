package com.example.demo.core.trace.listener;

import com.example.demo.core.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhaofushan
 * @date 2020/7/26 0026 1:12
 */
@Slf4j
public class TraceApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        LogUtil.logTrace(log, this.getClass(), "event is {}", event.getClass().getSimpleName());
    }

}
