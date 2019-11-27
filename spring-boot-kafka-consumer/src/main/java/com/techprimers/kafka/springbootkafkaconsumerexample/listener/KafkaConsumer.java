package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "Kafka_Example", group = "group_id")
//    public void consume(String message) {
//        System.out.println("Consumed message: " + message);
//        System.out.println("5");
//    }
//

    @KafkaListener(topics = "Kafka_Example", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user.getBooking_id());
        System.out.println("Consumed JSON Message: " + user);
        System.out.println("6");
    }
}
