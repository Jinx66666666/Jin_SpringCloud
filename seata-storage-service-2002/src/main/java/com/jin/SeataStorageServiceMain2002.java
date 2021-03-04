package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Jin
 * @Date: 2021/3/4 16:43
 * @Description: SeataStorageServiceMain2002
 * @version: V1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class SeataStorageServiceMain2002 {
    public static void main(String[] args)
    {
        SpringApplication.run(SeataStorageServiceMain2002.class, args);
    }

}
