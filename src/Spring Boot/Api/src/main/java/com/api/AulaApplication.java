package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AulaApplication.class, args);
    }
}

/*
 * controller -> recebe a requisição HTTP
 * service    -> regras de negócio
 * repository -> armazenamento (JPA)
 */