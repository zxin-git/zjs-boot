package com.zxin.java.spring.boot.validate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @author zxin
 */
@Configuration
public class ValidateConfiguration {
    
    @Bean
    public PersonValidator personValidator(){
        return new PersonValidator();
    }
    
    @Bean
    public MethodValidationPostProcessor validationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
    
}
