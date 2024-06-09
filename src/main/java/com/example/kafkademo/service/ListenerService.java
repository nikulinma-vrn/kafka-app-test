package com.example.kafkademo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ListenerService {
    //todo: Amplicode Designer -> Kafka -> @KafkaListener -> String

    @KafkaListener(topics = "newTopic", containerFactory = "stringListenerFactory")
    public void consumeString(String string) {
        System.out.println(string);
    }


}