package com.majesticbyte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Tikas2015Application extends SpringBootServletInitializer {
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Tikas2015Application.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Tikas2015Application.class);
    }
}
