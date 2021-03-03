package com.jin.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jin.entity.CommonResult;
import com.jin.entity.Payment;
import com.jin.myhandler.JinHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jin
 * @Date: 2021/3/2 17:11
 * @Description: RateLimitController
 * @version: V1.0
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按url限流测试OK", new Payment(2020L, "serial002"));
    }

    @GetMapping("/rateLimit/jinHandler")
    @SentinelResource(value = "jinHandler", blockHandlerClass = JinHandler.class, blockHandler = "handlerException2")
    public CommonResult jinHandler() {

        return new CommonResult(200, "按客戶自定义", new Payment(2020L, "serial003"));
    }

    public CommonResult handleException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }
}
