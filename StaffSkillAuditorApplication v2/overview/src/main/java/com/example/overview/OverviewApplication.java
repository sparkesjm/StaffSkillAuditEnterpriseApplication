package com.example.overview;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableRabbit
@ComponentScan(basePackages = {"com.example.overview.*"})
@SpringBootApplication
public class OverviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(OverviewApplication.class, args);
    }

}
