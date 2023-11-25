package com.mingvel.securityfilterexamplejava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFilter;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity,
            ApiKeyFilter apiKeyFilter) throws Exception {

        httpSecurity.addFilterBefore(apiKeyFilter, AuthenticationFilter.class);
        return httpSecurity.build();
    }
}
