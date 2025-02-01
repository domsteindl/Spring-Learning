package com.example.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Einstiegspunkt für die Spring Boot Anwendung.
 */
@SpringBootApplication
public class RestServiceApplication {
    /**
     * Startet die Spring Boot Anwendung.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(final String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
