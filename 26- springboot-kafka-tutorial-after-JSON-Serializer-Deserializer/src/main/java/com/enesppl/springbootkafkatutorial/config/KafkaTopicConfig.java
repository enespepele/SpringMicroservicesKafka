package com.enesppl.springbootkafkatutorial.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic enespplTopic(){


        return TopicBuilder.name("enesppl")
                .partitions(10)
                .build();
    }




}
