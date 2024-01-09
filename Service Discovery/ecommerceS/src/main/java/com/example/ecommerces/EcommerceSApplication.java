package com.example.ecommerces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceSApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceSApplication.class, args);
    }

}
