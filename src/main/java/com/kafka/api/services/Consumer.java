package com.kafka.api.services;

import com.kafka.api.model.Events;
import com.kafka.api.repository.EventsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Consumer {
    
    
    private EventsRepository eventsRepo;

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
     Date dateUpdated = new Date(System.currentTimeMillis());

//    Events eventTransaction = new Events();
//    @KafkaListener(topics = "test", groupId = "group_id")
//    public void consume(String message) throws IOException {
//        logger.info(String.format("Consumed message -> %s", message));
//        
//        eventTransaction.setProcessId(12);
//        eventTransaction.setDealerId(22);
//        eventTransaction.setCreated(dateUpdated);
//        eventTransaction.setCreatedBy(BigInteger.TEN);
////        eventsRepo.save(eventTransaction);
    
    
    
}
