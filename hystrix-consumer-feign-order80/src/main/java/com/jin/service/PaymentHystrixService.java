package com.jin.service;

import com.jin.service.impl.PaymentHystrixServiceImp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Jin
 * @Date: 2021/2/22 10:15
 * @Description:
 * @version: V1.0
 */
@Component
@FeignClient(value = "HYSTRIX-PROVIDER-PAYMENT", fallback = PaymentHystrixServiceImp.class)
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
