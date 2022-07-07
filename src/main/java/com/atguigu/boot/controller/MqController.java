package com.atguigu.boot.controller;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

@Controller
public class MqController {

    @RabbitListener(queues = "boot_queue01")
    public void consume(Message message) {
        System.out.println("lll");
        System.out.println("github test");
        System.out.println("得得得得是独立开发经理");
        System.out.println("pull立开发经理");  
        System.out.println("消息本身的内容: " + new String(message.getBody()));
    }
}
