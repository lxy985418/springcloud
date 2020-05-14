package com.springcloud.entity;/*
 *@author LeeXy
 *@date 2020/5/9 0:12
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-09 00:12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;

}
