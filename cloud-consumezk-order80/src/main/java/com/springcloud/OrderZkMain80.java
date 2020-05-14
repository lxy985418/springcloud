package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/11 18:23
 */



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-11 18:23
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {
   public static void main(String[] args) {
      SpringApplication.run(OrderZkMain80.class,args);
   }
}
