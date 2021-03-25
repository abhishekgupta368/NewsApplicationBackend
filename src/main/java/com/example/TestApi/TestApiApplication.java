package com.example.TestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
@EnableScheduling
public class TestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {

		return builder
				.setConnectTimeout(Duration.ofMillis(3000))
				.setReadTimeout(Duration.ofMillis(3000))
				.build();
	}
}

