package com.dva.api_gateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

        @Bean
        public RouteLocator routeLocator(RouteLocatorBuilder builder,
                        @Value("${book-service.url}") String bookServiceUrl) {
                return builder.routes()
                                .route("book-service", r -> r
                                                .path("/api/v1/book/**",
                                                                "/api/v1/author/**",
                                                                "/api/v1/categorie/**",
                                                                "/api/v1/favorites/**")
                                                .uri(bookServiceUrl))
                                .build();
        }
}