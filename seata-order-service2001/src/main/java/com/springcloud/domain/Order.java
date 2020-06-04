package com.springcloud.domain;/*
 *@author LeeXy
 *@date 2020/6/4 16:20
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-04 16:20
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    private Integer status;
    //订单状态：0：创建中；1：已完结
}
