package com.enesppl.springbootkafkatutorial.KafkaProducer;


import com.enesppl.springbootkafkatutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JSonKafkaProducer {

  private static final Logger LOGGER = LoggerFactory.getLogger(JSonKafkaProducer.class);

  private KafkaTemplate<String , User> kafkaTemplate;



    public JSonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(User data){
        LOGGER.info(String.format("Message sent -> %s",data.toString()));
      Message<User> message= MessageBuilder
              .withPayload(data)
              .setHeader(KafkaHeaders.TOPIC,"enesppl")
              .build();

      kafkaTemplate.send(message);
    };








}
