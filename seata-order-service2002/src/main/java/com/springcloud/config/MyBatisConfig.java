package com.springcloud.config;/*
 *@author LeeXy
 *@date 2020/6/5 2:44
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-05 02:44
 **/

@Configuration
@MapperScan({"com.springcloud.dao"})
public class MyBatisConfig {
}
