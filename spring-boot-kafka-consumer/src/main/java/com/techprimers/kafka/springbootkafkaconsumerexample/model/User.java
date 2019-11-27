package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import lombok.*;
import lombok.*;

import java.sql.Timestamp;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String booking_id;
    private String vehicle_id ;

}