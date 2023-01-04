package com.zxin.java.spring.boot.validate;

import com.zxin.java.spring.boot.validate.bean.AtLeastOneBean;
import com.zxin.java.spring.boot.validate.bean.Person;
import com.zxin.java.spring.boot.validate.bean.ScriptAssertBean;
import com.zxin.java.spring.boot.validate.bean.Staff;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author zxin
 */
@Validated
@Service
public class ValidateService {
    
    public void validateService(@Valid Staff staff){
        System.out.println(staff);
    }
    
    public void validatePerson(@Valid Person person){
        System.out.println(person);
    }
    
    public void validateBean(@Valid ScriptAssertBean bean){
        System.out.println(bean);
    }
    
    public void validateBean(@Valid AtLeastOneBean bean){
        System.out.println(bean);
    }
    
}
