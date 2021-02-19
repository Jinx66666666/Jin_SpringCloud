package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Jin
 * @Date: 2021/2/4 10:06
 * @Description:
 * @version: V1.0
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "PAYMENT-SERVICE", configuration = MySelfRule.class)//使用随机负载均衡
public class EurekaConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerMain80.class, args);
    }

}
