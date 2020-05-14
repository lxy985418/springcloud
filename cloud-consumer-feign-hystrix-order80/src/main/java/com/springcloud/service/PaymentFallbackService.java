package com.springcloud.service;/*
 *@author LeeXy
 *@date 2020/5/15 3:07
 */

import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-15 03:07
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----------PaymentFallbackService fall back ----paymentInfo_OK,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----------PaymentFallbackService fall back--- paymentInfo_TimeOut ,/(ㄒoㄒ)/~~";
    }
}
