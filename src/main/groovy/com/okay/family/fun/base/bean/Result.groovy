package com.okay.family.fun.base.bean

import com.okay.family.fun.base.interfaces.ErrorCode

/**
 * 通用的返回体
 * 配合moco框架使用
 */
class Result<T> extends AbstractBean {

    /**
     * code码
     */
    int code
    /**
     * 返回信息
     */
    T data

    Result(int code, T data) {
        this.code = code
        this.data = data
    }
/**
 * 返回简单的响应
 * @param c
 */
    Result(int c) {
        this.code = c
    }

    def Result() {
    }
/**
 * 返回成功响应内容
 * @param data
 * @return
 */
    static <T> Result<T> success(T data) {
        new Result<>(0, data)
    }

    static <T> Result<T> build(ErrorCode errorCode) {
        new Result(errorCode)
    }

    static <T> Result<T> build(int code, String desc) {
        new Result(code, desc)
    }

/**
 * 返回通用失败的响应内容
 * @param data
 * @return
 */
    static <T> Result<T> fail(T data) {
        new Result<T>(TEST_ERROR_CODE, data)
    }

    static <T> Result<T> fail(ErrorCode errorCode) {
        new Result<T>(errorCode)
    }

    Result(ErrorCode errorCode) {
        this.code = errorCode.getcode()
        this.data = errorCode.getDesc()
    }
/**
 * 是否成功响应
 * @return
 */
    boolean isSuccess() {
        code == 0
    }
}
