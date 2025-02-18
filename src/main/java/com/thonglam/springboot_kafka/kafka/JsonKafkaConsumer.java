package com.thonglam.springboot_kafka.kafka;

import com.thonglam.springboot_kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;


import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received -> %s", user.toString()));

    }
}
