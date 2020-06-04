package com.springcloud.domain;/*
 *@author LeeXy
 *@date 2020/6/4 17:05
 */

import lombok.Data;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-04 17:05
 **/

@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}