package com.springcloud.service;/*
 *@author LeeXy
 *@date 2020/5/13 1:02
 */

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-13 01:02
 **/
@Component
@FeignClient(value = "SPRINGCLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
