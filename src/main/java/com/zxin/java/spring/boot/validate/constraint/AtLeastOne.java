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
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 至少存在一个
 * @author zxin
 */
@Target({ TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = AtLeastOneValidator.class)
@Documented
@Repeatable(AtLeastOne.List.class)
public @interface AtLeastOne {
    
    String message() default "{javax.validation.constraints.AtLeastOne.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    String[] value();
    
    
    @Target({ TYPE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        AtLeastOne[] value();
    }
}