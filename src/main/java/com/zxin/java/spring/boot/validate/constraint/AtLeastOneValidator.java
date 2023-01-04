package com.zxin.java.spring.boot.validate.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 实现ConstraintValidator
 *
 * @author Summerday
 */
public class AtLeastOneValidator implements ConstraintValidator<AtLeastOne, Object> {
    
    private String[] fieldNames;

    /**
     * 初始化获取注解中的值
     */
    @Override
    public void initialize(AtLeastOne constraintAnnotation) {
        this.fieldNames = constraintAnnotation.value();
    }

    /**
     * 校验
     */
    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintContext) {
        if (object == null) {
            return true;
        }
    
        if(fieldNames == null){
            return true;
        }
        
        Map<String, Object> filedValueMap = filedValueMap(object, fieldNames);
        return filedValueMap.entrySet().stream().anyMatch(e -> e.getValue() != null);
    }
    
    /**
     * 获取属性值map
     * @param object
     * @param fieldNames 属性名数组
     * @return
     */
    Map<String, Object> filedValueMap(Object object, String[] fieldNames){
        Map<String, Object> map = new LinkedHashMap<>(fieldNames.length);
        try {
            Class<?> aClass = object.getClass();
            for (int i = 0; i < fieldNames.length; i++) {
                Field field = aClass.getDeclaredField(fieldNames[i]);
                field.setAccessible(true);
                map.put(fieldNames[i], field.get(object));
            }
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
        return map;
    }
    
}