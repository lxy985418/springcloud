package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/5/11 17:59
 */

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-11 17:59
 **/
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
           return "com.springcloud with zookeeper:" + serverPort +"\t"+ UUID.randomUUID().toString();
    }
}
