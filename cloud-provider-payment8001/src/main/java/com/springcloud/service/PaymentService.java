package com.springcloud.service;/*
 *@author LeeXy
 *@date 2020/5/9 0:34
 */

import com.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {

    public int create (Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
