package com.main.ppstudy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * 【全局异常捕获与处理】-返回非json
 *
 * 注解：@ControllerAdvice：开启全局的异常捕获
 *      @ExceptionHandler：说明捕获哪些异常，对那些异常进行处理
 */
@ControllerAdvice
public class GlobalNoJsonExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e){
        System.out.println("【全局异常捕获】发生了异常（MyExceptionHandler）"+e);
        return e.getMessage();
    }

}
