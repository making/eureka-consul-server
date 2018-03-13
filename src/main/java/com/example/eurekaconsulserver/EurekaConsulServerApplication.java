package com.example.eurekaconsulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaConsulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsulServerApplication.class, args);
    }
}
