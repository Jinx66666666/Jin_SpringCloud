package com.jin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: Jin
 * @Date: 2021/02/08 22:57
 * @Description:
 * @version: V1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "SpringCloud with Consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
