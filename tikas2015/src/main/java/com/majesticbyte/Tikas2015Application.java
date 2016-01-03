package com.majesticbyte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Tikas2015Application {
    public static void main(String[] args) {
        SpringApplication.run(Tikas2015Application.class);
    }
}
