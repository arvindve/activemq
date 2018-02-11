package com.example.activemq.inmemoryactivemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "inmemory.queue")
    public void listener(String message){
        System.out.println("Recieved message "+message);
    }
}
