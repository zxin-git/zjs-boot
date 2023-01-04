package com.zxin.java.spring.boot.validate;

import com.zxin.java.spring.boot.validate.bean.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author zxin
 */
@RestController
@RequestMapping("/validate/example")
public class ValidateExampleController {
    
    @Autowired
    private ValidateService service;

    @PostMapping("/controller")
    public String controller(@RequestBody @Valid Staff staff){
        System.out.println(staff);
        service.validateService(staff);
        return staff.getName();
    }
    
    @GetMapping("/service")
    public String service(){
        Staff staff = new Staff();
        service.validateService(staff);
        return staff.getName();
    }
    
    
}
