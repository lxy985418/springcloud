package com.springcloud.controller;/*
 *@author LeeXy
 *@date 2020/5/19 1:27
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description:
 * @author: LeeXy
 * @create: 2020-05-19 01:27
 **/
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
    @Value("${server.port}")
   private String serverPort;

    @StreamListener(Sink.INPUT)
//    监听输入源

    public void input(Message<String> message) {
        System.out.println("消费者1号，接受："+message.getPayload()+"\t port:"+serverPort);
    }
}
