package com.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class StreamKafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaApplication.class, args);
    }
}
