package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/5/9 15:36
 */

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import com.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 15:36
 **/
@RestController
@Slf4j
public class OrderController {
    //public static final String PAYMEN_URL = "http://localhost:8001";

    public static final String PAYMEN_URL = "http://SPRINGCLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    LoadBalancer loadBalancer;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create (Payment payment){

        return restTemplate.postForObject(PAYMEN_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment (@PathVariable("id")Long id){

        return restTemplate.getForObject(PAYMEN_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2 (@PathVariable("id")Long id){

         ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMEN_URL+"/payment/get/"+id,CommonResult.class);

         if(entity.getStatusCode().is2xxSuccessful()){
             return entity.getBody();
         }else {
             return new CommonResult<>(444,"操作失败");
         }
    }


    @GetMapping(value = "/consumer/payment/lb")
    public String getPayment() {
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PAYMENT-SERVICE");
        if(instances == null ||instances.size()<=0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.incetance(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }

}
