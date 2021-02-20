package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Jin
 * @Date: 2021/02/08 22:52
 * @Description:
 * @version: V1.0
 */
@SpringBootApplication
@EnableFeignClients
public class FeignConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerMain80.class, args);
    }
}
