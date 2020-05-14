package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/12 17:16
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-12 17:16
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Order80 {
    public static void main(String[] args) {
        SpringApplication.run(Order80.class,args);
    }
}
