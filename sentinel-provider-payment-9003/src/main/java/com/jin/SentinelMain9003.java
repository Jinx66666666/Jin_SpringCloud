package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Jin
 * @Date: 2021/3/3 11:13
 * @Description:
 * @version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain9003.class, args);
    }
}
