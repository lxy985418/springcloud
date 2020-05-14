package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/9 17:08
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 17:08
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka7003Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7003Main.class,args);
    }
}
