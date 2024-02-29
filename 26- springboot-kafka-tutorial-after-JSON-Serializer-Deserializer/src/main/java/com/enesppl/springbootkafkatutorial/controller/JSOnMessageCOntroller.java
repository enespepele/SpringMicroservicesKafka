package com.enesppl.springbootkafkatutorial.controller;


import com.enesppl.springbootkafkatutorial.KafkaProducer.JSonKafkaProducer;
import com.enesppl.springbootkafkatutorial.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JSOnMessageCOntroller {

        private JSonKafkaProducer kafkaProducer;

    public JSOnMessageCOntroller(JSonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }


    @PostMapping("/publish")
    public ResponseEntity<String > publish(@RequestBody  User user){

        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON Message Senk to the Malatya");

    };


}
