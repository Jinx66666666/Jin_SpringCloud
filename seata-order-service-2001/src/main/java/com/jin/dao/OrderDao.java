package com.jin.dao;

import com.jin.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Jin
 * @Date: 2021/3/4 14:35
 * @Description:
 * @version: V1.0
 */
@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long id, @Param("status") Integer status);
}
