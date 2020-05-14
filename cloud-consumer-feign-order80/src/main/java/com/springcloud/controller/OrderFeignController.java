package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/5/13 1:46
 */

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import com.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-13 01:46
 **/
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
      return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/comsumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
