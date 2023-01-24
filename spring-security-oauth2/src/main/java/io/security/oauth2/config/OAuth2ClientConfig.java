package io.security.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration(proxyBeanMethods = false)
public class OAuth2ClientConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeRequests((request) -> request.antMatchers("/login").permitAll().anyRequest().authenticated());
		http.oauth2Login(oauth2 -> oauth2.loginPage("/login")
				.authorizationEndpoint(authorizationEndpointConfig ->
					authorizationEndpointConfig.baseUri("/oauth2/v1/authorization"))
				.redirectionEndpoint(redirectionEndpointConfig ->
					redirectionEndpointConfig.baseUri("/login/v1/oauth2/code/*"))
				);
		
		return http.build();
	}
	
}
