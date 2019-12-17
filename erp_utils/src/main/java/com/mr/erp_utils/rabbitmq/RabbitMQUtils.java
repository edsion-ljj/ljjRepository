package com.mr.erp_utils.rabbitmq;


import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class RabbitMQUtils {

    @Autowired
    private RabbitMessagingTemplate  messagingTemplate;

    public void sendMessage(){

        HashMap<String, Object> messageBody = new HashMap<>();
        messageBody.put("orderName","ljjOrder");
        messageBody.put("orderPrice",10);
        try {
            //exchange名字  routingkey    对应的值
            messagingTemplate.convertAndSend("exchangeMall2","mall2", JSON.toJSONString(messageBody));
            System.out.println(" 发送成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" 发送失败");
        }

    }
}
