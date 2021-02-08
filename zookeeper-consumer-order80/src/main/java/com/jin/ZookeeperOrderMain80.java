package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Jin
 * @Date: 2021/02/08 17:05
 * @Description: OrderMain80
 * @version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperOrderMain80.class,args);
    }
}
