package com.example.demo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;

@Configuration
public class RestTemplateResolver {

    private final String demo2Url = "http://demo2:8080";

    @Bean
    @Qualifier("demo2RestOptions")
    public RestOperations demo2RestOptions(RestTemplateBuilder restTemplateBuilder) {
//        restTemplateBuilder.rootUri(demo2Url);
        return restTemplateBuilder.build();
    }
}
