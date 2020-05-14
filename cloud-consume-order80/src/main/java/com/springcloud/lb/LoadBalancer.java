package com.springcloud.lb;/*
 *@author LeeXy
 *@date 2020/5/12 20:39
 */

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

//    得到所有的服务名

    ServiceInstance incetance(List<ServiceInstance> serviceInstances);
}
