package myrule;/*
 *@author LeeXy
 *@date 2020/5/12 18:54
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-12 18:54
 **/

public class MySelfRule {
    @Bean
    public IRule myRule () {
        return new RandomRule();
        //定义为随机
    }
}
