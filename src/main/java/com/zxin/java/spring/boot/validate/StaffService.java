package com.zxin.java.spring.boot.validate;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author zxin
 */
@Validated
@Service
public class StaffService {
    
    public void validateService(@Valid Staff staff){
    
    }
    
    
    public void validatePerson(@Valid Person person){
        System.out.println(person);
    }
    
    
    public void validateBean(@Valid ScriptAssertBean bean){
        System.out.println(bean);
    }
    
}
