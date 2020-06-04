package com.springcloud.service;/*
 *@author LeeXy
 *@date 2020/6/5 2:55
 */

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-05 02:55
 **/


public interface AccountService {

    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}

