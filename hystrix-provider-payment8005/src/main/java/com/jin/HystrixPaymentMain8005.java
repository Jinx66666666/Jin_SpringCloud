package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Jin
 * @Date: 2021/2/20 16:16
 * @Description: HystrixPaymentMain8005
 * @version: V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class HystrixPaymentMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentMain8005.class, args);
    }
}
