package com.springcloud.dao;/*
 *@author LeeXy
 *@date 2020/6/5 2:52
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.math.BigDecimal;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-06-05 02:52
 **/


@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
