package com.main.ppstudy.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 【全局异常捕获与处理】-返回json
 * 注解：@ControllerAdvice：开启全局的异常捕获
 *      @ExceptionHandler：说明捕获哪些异常，对那些异常进行处理
 *      @ResponseBody：用于将对象解析成json,方便前后端的交互
 */
//@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理通用异常处理
     */
    @ExceptionHandler(value = Exception.class)
    public ExceptionResult exceptionHandler(Exception e) {
        //记录日志
        logger.error("发生普通异常", e);
        return ExceptionResult.otherError(ErrorEnum.INTERNAL_SERVER_ERROR, e.getMessage());
    }


    /**
     * 处理自定义异常-ApiException
     */
    @ExceptionHandler(value = ApiException.class)
    public ExceptionResult apiExceptionHandler(ApiException e) {
        //记录日志
        logger.error("发生API异常", e);
        return ExceptionResult.apiError(e);
    }


    //TODO 根据其他业务情况处理不同的异常数据

}

