package com.growthhungry.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class MyAppConfig {

    // Configure view resolver
    @Bean
    InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
        // ✅ Password encoder bean (BCrypt)
    @Bean
    public PasswordEncoder passwordEncoder() {
        // Default strength = 10, you can adjust (e.g. new BCryptPasswordEncoder(12))
        return new BCryptPasswordEncoder(12);
    }
}