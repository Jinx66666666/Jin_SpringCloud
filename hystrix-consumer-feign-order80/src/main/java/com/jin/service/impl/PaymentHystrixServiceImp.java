package com.jin.service.impl;

import com.jin.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author: Jin
 * @Date: 2021/2/22 14:14
 * @Description:
 * @version: V1.0
 */
@Component
public class PaymentHystrixServiceImp implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务器宕机-----PaymentHystrixService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务器宕机-----PaymentHystrixService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
