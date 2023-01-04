package com.zxin.java.spring.boot.validate.bean;

import com.zxin.java.spring.boot.validate.constraint.CaseSensitive;
import lombok.Data;

/**
 * @author zxin
 */
@Data
public class Person {

    @CaseSensitive
    private String name;
    
    private int age;

}