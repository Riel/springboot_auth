package com.auth0.samples.authapi.springbootauthupdated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootAuthUpdatedApplication {


	// https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
	// https://stackoverflow.com/questions/39821734/can-we-post-jwt-token-in-thymeleaf-form
	// https://www.baeldung.com/java-json-web-tokens-jjwt

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAuthUpdatedApplication.class, args);
	}
}
