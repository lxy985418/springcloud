package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/5/11 18:33
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-11 18:33
 **/
@RestController
@Slf4j
public class PaymentController {
    public static final String INVOKE_URL = "http://com.springcloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consume/payment/zk")
    public String paymentInfo () {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return  result;
    }


}
