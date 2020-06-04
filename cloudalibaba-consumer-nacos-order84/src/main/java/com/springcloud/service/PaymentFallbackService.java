package com.springcloud.service;/*
 *@author LeeXy
 *@date 2020/6/3 21:12
 */

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-03 21:12
 **/
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
