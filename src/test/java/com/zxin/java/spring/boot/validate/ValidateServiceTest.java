package com.zxin.java.spring.boot.validate;

import com.zxin.java.spring.boot.AbstractBootApplicationTest;
import com.zxin.java.spring.boot.validate.bean.AtLeastOneBean;
import com.zxin.java.spring.boot.validate.bean.Person;
import org.junit.Test;

public class ValidateServiceTest extends AbstractBootApplicationTest {
    
    @Test
    public void validateService() {
    }
    
    @Test
    public void validatePerson() {
        ApplicationContextHolder.get().getBean(ValidateService.class).validatePerson(new Person());
    }
    
    
    @Test
    public void validateBean() {
        AtLeastOneBean atLeastOneBean = new AtLeastOneBean();
        atLeastOneBean.setId("1");
        ApplicationContextHolder.get().getBean(ValidateService.class).validateBean(atLeastOneBean);
    }
}