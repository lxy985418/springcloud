package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/15 4:14
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-15 04:14
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
