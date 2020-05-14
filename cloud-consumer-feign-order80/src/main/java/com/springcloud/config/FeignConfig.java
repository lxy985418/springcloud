package com.springcloud.config;/*
 *@author LeeXy
 *@date 2020/5/14 17:05
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-14 17:05
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel () {
        return Logger.Level.FULL;
    }
}
