package com.jsm.jmsDemo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "exampleQueue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

