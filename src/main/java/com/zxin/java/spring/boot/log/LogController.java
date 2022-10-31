package com.zxin.java.spring.boot.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxin
 */
@Slf4j
@RestController
public class LogController {

    @GetMapping("/log/{record}")
    public String a(@PathVariable String record){
        log.info(record);
        log.warn("ex", new RuntimeException("ss"));
        return record;
    }


}
