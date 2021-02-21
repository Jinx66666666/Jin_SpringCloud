package com.jin.controller;

import com.jin.entity.CommonResult;
import com.jin.entity.Payment;
import com.jin.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Jin
 * @Date: 2021/2/20 10:24
 * @Description: OrderFeignController
 * @version: V1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable(value = "id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }

}
