package com.example.overview.application;

import com.example.overview.application.events.EventOne;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "eventOne", id = "eventOneListener")//unique id for listener
public class EventOneListener {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @RabbitHandler
    public void receiver(String message) throws JsonProcessingException {
        EventOne test = new ObjectMapper().readValue(message, EventOne.class);//Issue with the config convertor
        LOG.info(test.getAggregateID());
    }
}