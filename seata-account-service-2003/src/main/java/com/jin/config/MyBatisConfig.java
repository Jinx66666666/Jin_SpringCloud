package com.jin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Jin
 * @Date: 2021/3/4 15:32
 * @Description: MyBatisConfig
 * @version: V1.0
 */
@Configuration
@MapperScan({"com.jin.dao"})
public class MyBatisConfig {
}
