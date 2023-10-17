package com.sydney5619.ai_assistant_backend.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Slf4j
@Configuration

public class WebMvcConfiguration extends WebMvcConfigurationSupport {
    /**
     * cross domain
     * @param registry
     */
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // allow all path
                .allowedOrigins("http://localhost:3000") // all request from localhost:3000
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")// Allowed HTTP methods
                .allowedHeaders("*");  // Allow all headers
    }

}




