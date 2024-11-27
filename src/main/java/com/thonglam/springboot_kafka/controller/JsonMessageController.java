package com.thonglam.springboot_kafka.controller;

import com.thonglam.springboot_kafka.kafka.JsonKafkaProducer;
import com.thonglam.springboot_kafka.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/kafka")
public class JsonMessageController {


    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }


    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        this.jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message send to kafka topic");
    }

}
