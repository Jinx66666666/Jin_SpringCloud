package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Jin
 * @Date: 2021/3/3 11:24
 * @Description:
 * @version: V1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SentinelOrderMain84 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelOrderMain84.class, args);
    }
}
