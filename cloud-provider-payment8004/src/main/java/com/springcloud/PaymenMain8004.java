package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/11 17:56
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-11 17:56
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymenMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymenMain8004.class,args);
    }
}
