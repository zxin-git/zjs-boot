package com.zxin.java.spring.boot.validate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Objects;

/**
 * @author zxin
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextHolder.applicationContext = applicationContext;
    }
    
    public static ApplicationContext get() {
        Assert.state(Objects.nonNull(applicationContext), "ApplicationContext未注入");
        return applicationContext;
    }
    
}
