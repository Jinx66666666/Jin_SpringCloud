package com.jin.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: Jin
 * @Date: 2021/2/19 15:42
 * @Description:
 * @version: V1.0
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
