package com.springcloud.service;/*
 *@author LeeXy
 *@date 2020/6/4 17:15
 */

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-04 17:15
 **/

public interface StorageService {
    // 扣减库存

    void decrease(Long productId, Integer count);
}
