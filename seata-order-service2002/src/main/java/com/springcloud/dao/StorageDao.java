package com.springcloud.dao;/*
 *@author LeeXy
 *@date 2020/6/4 17:05
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-04 17:05
 **/

@Mapper
public interface StorageDao {


    //扣减库存信息

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
