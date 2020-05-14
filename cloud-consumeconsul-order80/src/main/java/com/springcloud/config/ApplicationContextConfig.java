package com.springcloud.config;/*
 *@author LeeXy
 *@date 2020/5/11 18:30
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-11 18:30
 **/
@Configuration
public class ApplicationContextConfig {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
