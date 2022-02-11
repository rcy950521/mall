package com.rcy.mall.common.api;

/**
 * created by rcy on 2022/2/11.
 * 常用API返回对象接口
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
