package com.edusynchub.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EduSyncHubApplication {

    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(EduSyncHubApplication.class, args);




    }

}
