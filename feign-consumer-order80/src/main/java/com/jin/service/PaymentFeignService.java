package com.jin.service;

import com.jin.entity.CommonResult;
import com.jin.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Jin
 * @Date: 2021/2/20 10:19
 * @Description: PaymentFeignService
 * @version: V1.0
 */
@Component
@FeignClient("PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id);
}
