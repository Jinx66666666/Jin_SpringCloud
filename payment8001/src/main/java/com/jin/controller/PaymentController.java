package com.jin.controller;

import com.jin.entity.CommonResult;
import com.jin.entity.Payment;
import com.jin.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Jin
 * @Date: 2021/2/2 10:59
 * @Description: PanmentController
 * @version: V1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverport;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/save")
    public CommonResult save(Payment payment) {
        int result = paymentService.save(payment);
        log.info("--------插入成功-------" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据成功,服务器为:" + serverport, result);
        } else {
            return new CommonResult(500, "插入数据失败,服务器为:" + serverport, result);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable(value = "id") long id) {
        Payment payment = paymentService.getById(id);

        log.info("--------查询成功-------" + payment);

        if (payment != null) {
            return new CommonResult(200, "查询数据成功,服务器为:" + serverport, payment);
        } else {
            return new CommonResult(500, "查询数据失败,参数id为" + id + ",服务器为:" + serverport, null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("===服务信息:" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("===地址信息:" + instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }
}
