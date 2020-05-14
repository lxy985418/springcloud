package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/9 15:30
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 15:30
 **/

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "SPRINGCLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
