package com.mingvel.securityfilterexamplejava;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class FilterTestConfig {

    @Bean
    ApiKeyFilter apiKeyFilter() {

        return new ApiKeyFilter();
    }
}
