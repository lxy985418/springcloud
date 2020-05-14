package com.springcloud.entity;/*
 *@author LeeXy
 *@date 2020/5/9 0:15
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 00:15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
//    返回前端通用字符串

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }

}
