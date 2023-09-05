package com.github.yohanaff.labpadroesdeprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Boot project generated via Spring Initializr.
 * The following modules were selected:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * - Springdoc OpenAPI (manually added dependency)
 *
 * @author yohanaff
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
