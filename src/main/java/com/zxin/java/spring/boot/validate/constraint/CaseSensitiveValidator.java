package com.zxin.java.spring.boot.validate.constraint;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 大小写敏感校验器
 * @author zxin
 */
public class CaseSensitiveValidator implements ConstraintValidator<CaseSensitive, String> {
    
    private CaseSensitive.CaseEnum caseEnum;
    
    @Override
    public void initialize(CaseSensitive constraintAnnotation) {
        caseEnum = constraintAnnotation.caseType();
    }
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        switch (caseEnum){
            case UPPER: return StringUtils.isAllUpperCase(value);
            case LOWER:
            default: return StringUtils.isAllLowerCase(value);
        }
    }
    
}
