package com.springcloud.config;/*
 *@author LeeXy
 *@date 2020/5/17 1:59
 */

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-17 01:59
 **/
@Configuration
public class GetWayConfig {
   @Bean
    public RouteLocator customRouteLocalor(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("payment_routh",
                r -> r.path("/guonei").
                        uri("https://news.baidu.com/guonei")).build();
        return routes.build();
   }

    @Bean
    public RouteLocator customRouteLocalor2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("payment_routh2",
                r -> r.path("/mil").
                        uri("https://news.baidu.com/guonei")).build();
        return routes.build();
    }

}
