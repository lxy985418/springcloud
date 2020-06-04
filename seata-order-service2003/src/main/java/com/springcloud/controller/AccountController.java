package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/6/5 3:22
 */

import com.springcloud.domian.CommonResult;
import com.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-05 03:22
 **/

@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        System.out.println("111111111111111-----------");

        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
