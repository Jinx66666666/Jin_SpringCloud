package com.jin.service;

import com.jin.entity.CommonResult;
import com.jin.entity.Payment;
import com.jin.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Jin
 * @Date: 2021/3/3 16:03
 * @Description: PaymentService
 * @version: V1.0
 */
@FeignClient(value = "sentinel-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
