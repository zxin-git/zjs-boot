package com.zxin.java.spring.boot.validate.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 至少存在一个
 * @author zxin
 */
@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE, TYPE_USE})
@Retention(RUNTIME)
@Documented
@Repeatable(CaseSensitive.List.class)
@Constraint(validatedBy = CaseSensitiveValidator.class)
public @interface CaseSensitive {
    
    String message() default "{javax.validation.constraints.CaseSensitive.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    /**
     * 大小写类型
     * @return
     */
    CaseEnum caseType() default CaseEnum.LOWER;
    
    @Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List {
        CaseSensitive[] value();
    }
    
    enum CaseEnum{
        UPPER, LOWER;
    }
}