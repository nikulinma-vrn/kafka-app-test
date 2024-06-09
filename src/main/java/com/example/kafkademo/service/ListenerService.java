package com.example.kafkademo.service;

import com.example.kafkademo.dto.DataDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ListenerService {

    @KafkaListener(topics = "newTopic", containerFactory = "stringListenerFactory")
    public void consumeString(String string) {
        System.out.println(string);
    }
}
