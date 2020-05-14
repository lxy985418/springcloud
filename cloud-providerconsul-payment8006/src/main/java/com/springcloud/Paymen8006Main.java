package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/12 16:56
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-12 16:56
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Paymen8006Main {
    public static void main(String[] args) {
        SpringApplication.run(Paymen8006Main.class,args);
    }
}
