# Testing process

1. Generate code in KafkaConsumerConfig
2. Generate code in KafkaProducerConfig
3. Generate code in KafkaTopicConfig
4. Generate code in ListenerService
5. Run docker-compose.yaml
6. Run project
7. Send POST request via Postman: localhost:8080/msg/send with JSON body
```
{ 
    "description": "This is a desctiption", 
    "title": "This is title"     
} 
```
