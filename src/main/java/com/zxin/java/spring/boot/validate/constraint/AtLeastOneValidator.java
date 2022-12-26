package com.zxin.java.spring.boot.validate.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 实现ConstraintValidator
 *
 * @author Summerday
 */
public class AtLeastOneValidator implements ConstraintValidator<AtLeastOne, String> {

    /**
     * 初始化获取注解中的值
     */
    @Override
    public void initialize(AtLeastOne constraintAnnotation) {
    
    }

    /**
     * 校验
     */
    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {
        if (object == null) {
            return true;
        }

        boolean isValid = false;

        return isValid;
    }
}