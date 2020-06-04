package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/17 1:40
 */

import org.omg.CORBA.ARG_IN;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-17 01:40
 **/
@SpringBootApplication
@EnableEurekaClient
public class GetWay9527Main {
    public static void main(String[] args) {
        SpringApplication.run(GetWay9527Main.class, args);
    }
}
