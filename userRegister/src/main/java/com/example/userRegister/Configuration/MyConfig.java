package com.example.userRegister.Configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableAutoConfiguration
public class MyConfig {
     @Bean
    public BCryptPasswordEncoder getPassword(){
        return new BCryptPasswordEncoder(); 
    }
    
 @SuppressWarnings("deprecation")
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {


   

    http
            
            .authorizeRequests(authorize ->
                    authorize 
                           .requestMatchers("/api/user/**").permitAll() // Allow access to all other URLs
                            
            )
            .csrf(csrf -> csrf.disable()); 

            return http.build();
}
}
