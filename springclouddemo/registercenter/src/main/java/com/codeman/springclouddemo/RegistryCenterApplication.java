package com.codeman.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterApplication {
    public static void main(String[] args) throws Error{
        SpringApplication.run(RegistryCenterApplication.class, args);

    }
}
