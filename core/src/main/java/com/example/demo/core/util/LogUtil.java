package com.example.demo.core.util;

import lombok.experimental.UtilityClass;
import org.slf4j.Logger;
import org.springframework.util.StringUtils;

/**
 * @author zhaofushan
 * @date 2020/7/26 0026 1:58
 */
@UtilityClass
public class LogUtil {
    public void consoleTrace(Class logClass, String extraMessage, Object... extraParams) {
        String format = "call %s" + (StringUtils.isEmpty(extraMessage) ? "" : "," + extraMessage);
        Object[] args = new Object[1 + extraParams.length];
        args[0] = logClass.getSimpleName();
        System.arraycopy(extraParams, 0, args, 1, args.length - 1);
        System.out.println(String.format(format, args));
    }

    public void logTrace(Logger logger, Class logClass, String extraMessage, Object... extraParams) {
        String format = "call {}" + (StringUtils.isEmpty(extraMessage) ? "" : "," + extraMessage);
        Object[] args = new Object[1 + extraParams.length];
        args[0] = logClass.getSimpleName();
        System.arraycopy(extraParams, 0, args, 1, args.length - 1);
        logger.trace(format, args);
    }

    public void logTrace(Logger logger, Class logClass) {
        logTrace(logger, logClass, null);
    }
}
