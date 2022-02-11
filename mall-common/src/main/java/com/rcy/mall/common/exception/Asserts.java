package com.rcy.mall.common.exception;

import com.rcy.mall.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * created by rcy on 2022/2/11.
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
