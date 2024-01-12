package com.example.system.kafka.producer.exception;

public class KafkaProducerException extends RuntimeException{
    public KafkaProducerException(String msg) {
        super(msg);
    }
}
