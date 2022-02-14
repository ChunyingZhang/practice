package com.example.practice.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().components(new Components()).info(new Info().title("Practice App").description("Spring boot server").version("1.0"));
    }

    @Bean
    public GroupedOpenApi allApi() {
        return GroupedOpenApi.builder().group("all").packagesToScan("com.example.practice").pathsToMatch("/**").build();
    }
}
