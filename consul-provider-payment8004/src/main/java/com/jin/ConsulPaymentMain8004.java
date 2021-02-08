package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Jin
 * @Date: 2021/02/08 22:52
 * @Description:
 * @version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPaymentMain8004.class, args);
    }
}
