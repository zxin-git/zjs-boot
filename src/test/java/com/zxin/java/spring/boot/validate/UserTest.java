package com.zxin.java.spring.boot.validate;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class UserTest {
    
    @Test
    public void a(){
        User user = new User();
    
        user.setName("seven");
        user.setGender("man");
        user.setAge(-1);
        user.setEmails(Arrays.asList("sevenlin@gmail.com", "sevenlin.com"));
    
        Set<ConstraintViolation<User>> result = Validation.buildDefaultValidatorFactory().getValidator().validate(user);
    
        List<String> message
                = result.stream().map(v -> v.getPropertyPath() + " " + v.getMessage() + ": " + v.getInvalidValue())
                .collect(Collectors.toList());
    
        message.forEach(System.out::println);
    }
    
}