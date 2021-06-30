package com.example.travistutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravisTutorialApplication {
    private int a = 1;
    public static void main(String[] args) {
        SpringApplication.run(TravisTutorialApplication.class, args);
    }

}
