package com.jin.service;

import com.jin.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Jin
 * @Date: 2021/2/2 10:53
 * @Description: PaymentService
 * @version: V1.0
 */
public interface PaymentService {

    public int save(Payment payment);

    public Payment getById(@Param("id") long id);
}
