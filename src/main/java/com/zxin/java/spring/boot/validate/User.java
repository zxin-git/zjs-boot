package com.zxin.java.spring.boot.validate;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Positive;
import java.util.List;

/**
 *
 * @author zxin
 */
@Data
public class User {
    
    private String name;
    private String gender;
    @Positive
    private int age;
    private List<@Email String> emails;


}