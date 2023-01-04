package com.zxin.java.spring.boot.validate;

import com.zxin.java.spring.boot.validate.bean.Person;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/validate/person")
public class ValidatePersonController {
    
    
    @PostMapping("/bind")
    public Map<String, Object> validatePerson(@Validated @RequestBody Person person, BindingResult result) {
        Map<String, Object> map = new HashMap<>();
        // 如果有参数校验失败，会将错误信息封装成对象组装在BindingResult里
        if (result.hasErrors()) {
            List<String> res = new ArrayList<>();
            result.getFieldErrors().forEach(error -> {
                String field = error.getField();
                Object value = error.getRejectedValue();
                String msg = error.getDefaultMessage();
                res.add(String.format("错误字段 -> %s 错误值 -> %s 原因 -> %s", field, value, msg));
            });
            map.put("msg", res);
            return map;
        }
        map.put("msg", "success");
        System.out.println(person);
        return map;
    }
    
}