package com.zxin.java.spring.boot.pay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zxin
 */
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {


    /**
     * 捕捉Exception异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String exceptionHandler(MethodArgumentNotValidException e) {
        StringBuilder errorMessage = new StringBuilder();
        BindingResult bindingResult = e.getBindingResult();
        if(bindingResult.getFieldErrors() != null){
            String fieldErrorString = bindingResult.getFieldErrors().stream()
                    .map(fieldError -> String.format("[%s]:%s", fieldError.getField(), fieldError.getDefaultMessage()))
                    .reduce((s1, s2) -> s1 + ", " + s2).orElse("");
            errorMessage.append(fieldErrorString).append(";");
        }
        log.info(errorMessage.toString());
        return errorMessage.toString();
    }

}
