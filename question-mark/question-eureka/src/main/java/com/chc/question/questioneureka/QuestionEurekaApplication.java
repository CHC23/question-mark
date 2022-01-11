package com.chc.question.questioneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuestionEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionEurekaApplication.class, args);
    }

}
