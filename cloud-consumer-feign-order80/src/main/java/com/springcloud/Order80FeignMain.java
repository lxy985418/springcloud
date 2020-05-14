package com.springcloud;/*
 *@author LeeXy
 *@date 2020/5/13 0:55
 */

import com.springcloud.service.PaymentFeignService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-13 00:55
 **/
@SpringBootApplication
@EnableFeignClients
public class Order80FeignMain {

    public static void main(String[] args) {

        SpringApplication.run(Order80FeignMain.class,args);
    }


}
