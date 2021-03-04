package com.jin.controller;

import com.jin.domain.CommonResult;
import com.jin.domain.Order;
import com.jin.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Jin
 * @Date: 2021/3/4 15:24
 * @Description: OrderController
 * @version: V1.0
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
