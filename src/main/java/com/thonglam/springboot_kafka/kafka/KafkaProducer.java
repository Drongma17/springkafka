package com.thonglam.springboot_kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

private Logger log =  LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(String message){
        log.info(String.format("Message Send %s", message));
        kafkaTemplate.send("javaguides", message);
    }
}
