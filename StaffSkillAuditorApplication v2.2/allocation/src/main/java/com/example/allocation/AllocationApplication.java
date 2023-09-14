package com.example.allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan("allocation.*")
@SpringBootApplication
public class AllocationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllocationApplication.class, args);
    }

}
