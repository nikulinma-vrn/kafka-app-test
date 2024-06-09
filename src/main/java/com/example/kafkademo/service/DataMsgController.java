package com.example.kafkademo.service;

import com.example.kafkademo.dto.DataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/msg")
@RequiredArgsConstructor
public class DataMsgController {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/send")
    public void sendData(@RequestBody DataDto dto) {
        kafkaTemplate.send("newTopic", UUID.randomUUID().toString(), dto);
    }
}