package com.example.android;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/20
 */
@SpringBootApplication
public class AndroidRestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidRestDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return arg -> Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
