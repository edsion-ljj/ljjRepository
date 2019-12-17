package com.mr.erp_utils.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ConsumerRecieverMQ {

    @RabbitHandler
    @RabbitListener(queues = "mallMaster.mr")//监听queue
    public void testUse(String msg) throws IOException {
        System.out.println(msg);////监听queue获取数据

    }

}
