package com.example.overview.application;

import java.util.UUID;
import com.example.overview.application.events.EventOne;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OverviewApplicationService {
    private Environment env;

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private RabbitTemplate sender;

    public void dummyCommand() {
        EventOne event = new EventOne(UUID.randomUUID().toString(),"some data");
        try{
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(event);
            sender.convertAndSend(env.getProperty("rabbitmq.exchange"), env.getProperty("rabbitmq.eventOneRoutingKey"),json);
        } catch (JsonProcessingException e) {
            LOG.error(e.getMessage());
        }
    }
}
