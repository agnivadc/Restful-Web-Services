package com.agniva.rest.webservices.restfulwebservices.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain filerChain(HttpSecurity http) throws Exception {

        //1. All requests should be authenticated
        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );

        //2. If a request is not authenticated, a web page is shown
        http.httpBasic(Customizer.withDefaults());

        //Disable CSRF -> PUT, POST
        http.csrf().disable();

        return http.build();
    }
}
