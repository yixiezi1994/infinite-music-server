package com.just1984.music.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.just1984.music")
@EntityScan("com.just1984.music.persistence.entity")
@EnableJpaRepositories("com.just1984.music.persistence.repository")
public class InfiniteMusicServerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfiniteMusicServerWebApplication.class, args);
    }

}

