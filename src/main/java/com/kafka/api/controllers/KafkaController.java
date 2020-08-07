package com.kafka.api.controllers;

import com.kafka.api.model.Events;
import com.kafka.api.repository.EventsRepository;
import com.kafka.api.services.Consumer;
import com.kafka.api.services.Producer;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
     Date dateUpdated = new Date(System.currentTimeMillis());

    private final Producer producer;
    
   
    @Autowired
    private EventsRepository eventsRepo;
   


    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody String message) {
        this.producer.sendMessage(message);
    }
    
    Events eventTransaction = new Events();
    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("Consumed message -> %s", message));
        
        eventTransaction.setProcessId(12);
        eventTransaction.setDealerId(22);
        eventTransaction.setCreated(dateUpdated);
        eventTransaction.setCreatedBy(BigInteger.TEN);
        eventsRepo.save(eventTransaction);
    }
}
