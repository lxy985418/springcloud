package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/5/12 16:59
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-12 16:59
 **/
@RestController
@Slf4j
public class PaymenController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "com.springcloud with consul:" + serverPort +"\t"+ UUID.randomUUID().toString();
    }
}
