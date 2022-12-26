package com.zxin.java.spring.boot.validate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.io.IOException;
import java.util.stream.Collectors;

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
                    .map(f -> String.format("[%s]:%s:(%s)", f.getField(), f.getDefaultMessage(), f.getRejectedValue()))
                    .collect(Collectors.joining(","));
            errorMessage.append(fieldErrorString).append(";");
        }
        log.warn(errorMessage.toString(), e);
        return errorMessage.toString();
    }
    
    
    /**
     * a
     * @param e
     * @return
     */
    //    @ExceptionHandler(ConstraintViolationException.class)
    public String handleConstraintViolationException(ConstraintViolationException e) {
        log.warn("", e);
        return e.getMessage();
    }
    
    /**
     * If the @Validated is failed, it will trigger a ConstraintViolationException
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public void constraintViolationException(ConstraintViolationException ex, HttpServletResponse response) throws IOException {
        ex.getConstraintViolations().forEach(x -> {
            String message = x.getMessage();
            Path propertyPath = x.getPropertyPath();
            Object invalidValue = x.getInvalidValue();
            log.warn("错误字段 -> {} 错误值 -> {} 原因 -> {}", propertyPath, invalidValue, message);
        });
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }

}
