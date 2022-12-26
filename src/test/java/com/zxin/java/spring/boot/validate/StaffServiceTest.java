package com.zxin.java.spring.boot.validate;

import com.zxin.java.spring.boot.AbstractBootApplicationTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffServiceTest extends AbstractBootApplicationTest {
    
    @Test
    public void validateService() {
    }
    
    @Test
    public void validatePerson() {
        ApplicationContextHolder.get().getBean(StaffService.class).validatePerson(new Person());
    }
}