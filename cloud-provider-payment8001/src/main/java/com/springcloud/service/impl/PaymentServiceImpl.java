package com.springcloud.service.impl;/*
 *@author LeeXy
 *@date 2020/5/9 0:35
 */

import com.springcloud.dao.PaymentDao;
import com.springcloud.entity.Payment;
import com.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 00:35
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create (Payment payment){
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(@Param("id")Long id){
        return paymentDao.getPaymentById(id);
    }
}
