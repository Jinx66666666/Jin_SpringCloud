package com.jin.service.impl;

import com.jin.entity.CommonResult;
import com.jin.entity.Payment;
import com.jin.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author: Jin
 * @Date: 2021/3/3 16:06
 * @Description:
 * @version: V1.0
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"Jin温馨提示:服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
