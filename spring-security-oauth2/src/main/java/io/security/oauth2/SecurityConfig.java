package io.security.oauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain1(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated();
		http.formLogin();
		//http.apply(new CustomSecurityConfigurer().setFlag(true));
		return http.build();		  
	}
	
	@Bean
	SecurityFilterChain securityFilterChain2(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated();
		http.formLogin();
		//http.apply(new CustomSecurityConfigurer().setFlag(true));
		http.httpBasic();
		return http.build();		
	}
}
