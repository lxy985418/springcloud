package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/5/9 0:39
 */

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import com.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 00:39
 **/
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @PostMapping(value = "/payment/create")
    public CommonResult create (@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("*****插入结果"+result);

        if(result==1){
            return  new CommonResult(200,"插入数据库成功,serverport"+serverPort,result);
        }else {
            return  new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById (@PathVariable("id")Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果"+payment+"ggggggggg");

        if(payment!=null){
            return  new CommonResult(200,"查询成功,serverport"+serverPort,payment);
        }else {
            return  new CommonResult(444,"查询失败,没有对应记录 ID为："+id,null);
        }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
