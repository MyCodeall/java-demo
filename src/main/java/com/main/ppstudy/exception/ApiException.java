package com.main.ppstudy.exception;

/**
 * 自定义异常处理类
 */
public class ApiException extends BaseException{

    protected Integer errorCode;
    protected String errorMsg;

    //构造方法1
    public ApiException(){

    }
    //构造方法2
    public ApiException(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    //构造方法3
    public ApiException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
