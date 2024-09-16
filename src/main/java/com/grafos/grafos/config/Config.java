package com.grafos.grafos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class Config implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Permitir cualquier origen
                .allowedMethods("*")  // Permitir cualquier método HTTP
                .allowedHeaders("*")  // Permitir cualquier cabecera
                .exposedHeaders("Authorization", "Content-Type") // Exponer cabeceras específicas si es necesario
                .maxAge(3600); // Tiempo máximo de caching de CORS en segundos
    }
}
