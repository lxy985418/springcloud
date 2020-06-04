package com.springcloud.config;/*
 *@author LeeXy
 *@date 2020/6/4 16:49
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-04 16:49
 **/

@Configuration
@MapperScan({"com.springcloud.dao"})
public class MyBatisConfig {
}
