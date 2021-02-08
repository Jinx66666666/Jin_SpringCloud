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
public class ConsulOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderMain80.class, args);
    }
}
