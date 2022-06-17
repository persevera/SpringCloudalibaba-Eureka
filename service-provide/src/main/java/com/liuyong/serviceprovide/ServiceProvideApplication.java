package com.liuyong.serviceprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvideApplication.class, args);
    }

}
