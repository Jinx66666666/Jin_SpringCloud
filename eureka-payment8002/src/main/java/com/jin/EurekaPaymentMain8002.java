package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Jin
 * @Date: 2021/2/2 9:59
 * @Description: 启动类
 * @version: V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaPaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaPaymentMain8002.class, args);
    }
}
