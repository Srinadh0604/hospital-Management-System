package com.Srinadh.hospitalManagement.config;


import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;


import jakarta.annotation.PostConstruct;

@Configuration
public class DotenvConfig {

    @PostConstruct
    public void init() {
        Dotenv dotenv = Dotenv.load();

        System.out.println("CLIENT ID: " + System.getProperty("GOOGLE_CLIENT_ID"));

        dotenv.entries().forEach(entry -> {
            System.setProperty(entry.getKey(), entry.getValue());
        });
    }
}

