package com.enesppl.springbootkafkatutorial.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;




    @Bean
    public NewTopic enespplTopic(){


        return TopicBuilder.name(topicName)
                .partitions(10)
                .build();
    }


    @Bean
    public NewTopic enespplJSONTopic(){


        return TopicBuilder.name("enesppl_json")
                .partitions(10)
                .build();
    }

}
