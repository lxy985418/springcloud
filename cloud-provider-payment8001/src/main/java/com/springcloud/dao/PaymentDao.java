package com.springcloud.dao;/*
 *@author LeeXy
 *@date 2020/5/9 0:19
 */

import com.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 00:19
 **/
@Mapper
public interface PaymentDao {
    public int create (Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
