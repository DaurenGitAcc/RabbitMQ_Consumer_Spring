package com.absattar.rabbitmq_receiver.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitReceiver {

    @RabbitListener(queues = {"FirstQueue"})
    public void receive(String message){
        log.info(message+" - receive from queue");
    }
}
