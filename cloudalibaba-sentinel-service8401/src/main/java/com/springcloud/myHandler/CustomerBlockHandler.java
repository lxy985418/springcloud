package com.springcloud.myHandler;/*
 *@author LeeXy
 *@date 2020/6/3 20:11
 */

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-03 20:11
 **/

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"按客户自定义,global handlerException ---------1");
    }
    public static CommonResult handlerException2 (BlockException exception){
        return new CommonResult(444,"按客户自定义,global handlerException ---------2");
    }
}
