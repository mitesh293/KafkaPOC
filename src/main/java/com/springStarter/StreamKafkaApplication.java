package com.springStarter;

import com.listnerservices.CustomerServices;
import com.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class StreamKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaApplication.class, args);
    }
}
