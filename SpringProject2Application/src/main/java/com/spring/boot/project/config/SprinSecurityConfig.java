package com.spring.boot.project.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableAutoConfiguration
public class SprinSecurityConfig {

	
	
	// its main method where we can do some filter 
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests(
				authorize -> authorize
				.requestMatchers("/home/").permitAll()
				.requestMatchers("/com-product/**").permitAll()
				.requestMatchers("/home/login").authenticated()
				.anyRequest().authenticated()
				
				).httpBasic(Customizer.withDefaults())
		
		.formLogin(formLogin -> formLogin
                .permitAll()  
            );
		
		return http.build();
	}

	
	// use to give our custom  user and password 
	
	@Bean
	UserDetailsService userDetailsService() {
		
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

		String encode = passwordEncoder().encode("123");

		System.out.println("Your password is :    " + encode);

		manager.createUser(User.builder().username("user").password(encode).roles("USER").build());
//		System.out.println(manager);
		return manager;
	}
//
//	
	// for password encoding 
	@Bean
	PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

}