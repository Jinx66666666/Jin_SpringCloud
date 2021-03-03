package com.jin.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jin.entity.CommonResult;

/**
 * @author: Jin
 * @Date: 2021/3/3 9:31
 * @Description: 自定义限流处理类
 * @version: V1.0
 */
public class JinHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "Jin自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "Jin自定义,global handlerException----2");
    }
}
