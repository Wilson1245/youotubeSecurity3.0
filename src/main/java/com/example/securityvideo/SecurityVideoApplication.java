package com.example.securityvideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.securityvideo.bean.entity")
@EnableJpaRepositories(basePackages = "com.example.securityvideo.dao")
public class SecurityVideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityVideoApplication.class, args);
    }

}
