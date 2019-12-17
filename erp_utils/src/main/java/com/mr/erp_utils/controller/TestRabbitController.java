package com.mr.erp_utils.controller;

import com.mr.erp_utils.rabbitmq.RabbitMQUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testRabbitController")
public class TestRabbitController {

    @Autowired
    private RabbitMQUtils rabbitMQUtils;


    @GetMapping("testRabbitMQ")
    public void  testRabbitMQ(){
        rabbitMQUtils.sendMessage();//第一个参数 那个快递投递  第二个参数 投递的名字  第三个参数 投递的内容

    }
}
