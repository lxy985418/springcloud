package com.springcloud.lb;/*
 *@author LeeXy
 *@date 2020/5/12 20:42
 */

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-12 20:42
 **/
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncreament (){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问next:"+next);
        return next;
    }

    @Override
    public ServiceInstance incetance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncreament() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
