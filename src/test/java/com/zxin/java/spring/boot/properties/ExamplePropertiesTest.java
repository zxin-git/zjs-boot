package com.zxin.java.spring.boot.properties;

import com.zxin.java.spring.boot.AbstractBootApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ExamplePropertiesTest extends AbstractBootApplicationTest {
    
    @Autowired
    private ExampleProperties properties;
    
    @Test
    public void getCallbackUrl() {
        System.out.println(properties.getCallbackUrl());
    }
    
}