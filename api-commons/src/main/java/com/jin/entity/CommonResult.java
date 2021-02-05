package com.jin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Jin
 * @Date: 2021/2/2 10:26
 * @Description: CommonResult
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        //调用自身类的构造方法
        this(code, message, null);

    }
}
