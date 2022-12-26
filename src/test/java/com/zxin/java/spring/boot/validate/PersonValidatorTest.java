package com.zxin.java.spring.boot.validate;

import org.junit.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

import static org.junit.Assert.*;

public class PersonValidatorTest {
    
    @Test
    public void validate() {
        Person person = new Person();
        // 创建Person对应的DataBinder
        DataBinder binder = new DataBinder(person);
        // 设置校验
        binder.setValidator(new PersonValidator());
    
        // 由于Person对象中的属性为空，所以校验不通过
        binder.validate();
        BindingResult results = binder.getBindingResult();
        System.out.println(results.hasErrors());
    }
}