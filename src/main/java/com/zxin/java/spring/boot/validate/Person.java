package com.zxin.java.spring.boot.validate;

import com.zxin.java.spring.boot.validate.constraint.CaseSensitive;
import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @author zxin
 */
@Data
public class Person {

//    @CaseSensitive
    private String name;
    
//    @Min(0)
    private int age;

}