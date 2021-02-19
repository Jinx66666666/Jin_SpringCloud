package com.jin.dao;

import com.jin.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Jin
 * @Date: 2021/2/2 10:35
 * @Description: PaymentDao
 * @version: V1.0
 */
@Mapper
public interface PaymentDao {

    public int save(Payment payment);

    public Payment getById(@Param("id") long id);
}
