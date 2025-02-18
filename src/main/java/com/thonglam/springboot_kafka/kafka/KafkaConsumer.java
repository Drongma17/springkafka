package com.thonglam.springboot_kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consum(String message){
        LOGGER.info(String.format("Message Received -> %s", message));
    }
}
