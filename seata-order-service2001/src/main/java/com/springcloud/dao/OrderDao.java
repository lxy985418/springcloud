package com.springcloud.dao;/*
 *@author LeeXy
 *@date 2020/6/4 16:35
 */

import com.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-04 16:35
 **/

@Mapper
public interface OrderDao
{
    //新建订单

    void create(Order order);

    //修改订单状态，从零改为1

    void update(@Param("userId") Long userId, @Param("status") Integer status);
}