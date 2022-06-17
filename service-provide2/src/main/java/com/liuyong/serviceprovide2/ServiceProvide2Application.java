package com.liuyong.serviceprovide2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProvide2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvide2Application.class, args);
    }

}
