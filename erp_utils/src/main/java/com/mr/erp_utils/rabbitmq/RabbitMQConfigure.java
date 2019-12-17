package com.mr.erp_utils.rabbitmq;


import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/*@Configuration*//*

public class RabbitMQConfigure {



    //创建对应的队列
    @Bean
    public Queue setQueue() {
        return new Queue("mallMaster");
    }

    //创建echange
    //DirectExchange:按照routingkey分发到指定队列
    @Bean
    public Exchange setExchange(){
        return new DirectExchange("exchangeMall");
    }



    //将 Queue 和 Exchange绑定
    @Bean
    public void bindExchangeAndQueue(){
        BindingBuilder.bind(setQueue()).to(setExchange()).with("mall");
    }
}
*/
