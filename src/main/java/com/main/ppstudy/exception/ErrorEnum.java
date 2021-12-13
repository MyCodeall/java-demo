package com.main.ppstudy.exception;

/**
 * 错误异常自定义枚举
 */
public enum ErrorEnum {
    // 数据操作错误定义
    SUCCESS(200, "success"),
    API_EXCEPTION(-1, "API内部异常！"),
    NO_PERMISSION(403,"无操作权限！"),
    NO_AUTH(401,"请先登录后操作！"),
    NOT_FOUND(404, "未找到该资源！"),
    INTERNAL_SERVER_ERROR(500, "内部异常！"),
    ;

    /** 错误码 */
    private Integer errorCode;

    /** 错误信息 */
    private String errorMsg;

    ErrorEnum(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
