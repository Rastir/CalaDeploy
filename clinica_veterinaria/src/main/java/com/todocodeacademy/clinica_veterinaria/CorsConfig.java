package com.todocodeacademy.clinica_veterinaria;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("https://tu-github-pages.github.io")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                                .allowedHeaders("*")
                                .allowCredentials(true);
            }
        };
    }

}