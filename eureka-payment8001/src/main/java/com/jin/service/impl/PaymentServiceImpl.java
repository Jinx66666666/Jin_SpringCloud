package com.jin.service.impl;

import com.jin.dao.PaymentDao;
import com.jin.entity.Payment;
import com.jin.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Jin
 * @Date: 2021/2/2 10:54
 * @Description:
 * @version: V1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getById(long id) {
        return paymentDao.getById(id);
    }
}
