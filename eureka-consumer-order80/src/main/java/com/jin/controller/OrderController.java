package com.jin.controller;

import com.jin.entity.CommonResult;
import com.jin.entity.Payment;
import com.jin.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author: Jin
 * @Date: 2021/2/4 10:12
 * @Description:
 * @version: V1.0
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {

    //  public static final String PAYMENT_URL = "http://localhost:8001";    //单机版
    public static final String PAYMENT_URL = "http://PAYMENT-SERVICE";   //集群版

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;


    @GetMapping("/payment/save")
    public CommonResult<Payment> save(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/save", payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/payment/getForEntity/{id}")
    public CommonResult<Payment> getForEntity(@PathVariable Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        log.info("====" + entity.getStatusCode() + "\t" + entity.getHeaders());
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败！");
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0) {
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/payment/getPort", String.class);
    }
}
