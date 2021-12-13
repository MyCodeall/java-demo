package com.main.ppstudy.exception;

/**
 * 异常返回结果格式定义
 * {
 *     "status": -1,
 *     "msg": "ErpApiException",
 *     "content": null
 * }
 * @param <T>
 */
public class ExceptionResult<T> {
    //状态码
    private Integer status;
    //提示信息
    private String msg;
    //数据
    private T content;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    /**
     * 构造方法1
     */
    public ExceptionResult() {

    }

    /**
     * 构造方法2：自定义返回结果
     * @param status
     * @param msg
     * @param content
     */
    public ExceptionResult(Integer status, String msg, T content) {
        this.status = status;
        this.msg = msg;
        this.content = content;
    }

    /**
     * 自定义API异常返回的结果
     * @param e
     * @return
     */
    public static ExceptionResult apiError(ApiException e){
        ExceptionResult result = new ExceptionResult();
        result.setStatus(ErrorEnum.API_EXCEPTION.getErrorCode());
        result.setMsg(e.getErrorMsg());
        result.setContent(null);
        return result;
    }

    /**
     * 其他异常处理方法返回的结果
     * @param errorEnum
     * @param msg
     * @return
     */
    public static ExceptionResult otherError(ErrorEnum errorEnum, String msg){
        ExceptionResult result = new ExceptionResult();

        result.setMsg(errorEnum.getErrorMsg());
        if (!msg.isEmpty()){
            result.setMsg(errorEnum.getErrorMsg() + "(" +msg+")");
        }
        result.setStatus(errorEnum.getErrorCode());
        result.setContent(null);
        return result;
    }

}
