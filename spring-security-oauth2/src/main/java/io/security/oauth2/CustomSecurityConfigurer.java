/*package io.security.oauth2;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class CustomSecurityConfigurer extends AbstractHttpConfigurer<CustomSecurityConfigurer, HttpSecurity>{

	private boolean isSecure;
	
	@Override
	public void init(HttpSecurity builder) throws Exception {
		super.init(builder);
		System.out.println("init");
	}
	
	@Override
	public void configure(HttpSecurity builder) throws Exception {
		super.configure(builder);
		System.out.println("configure");
		if(isSecure) {
			System.out.println("is secure");
		}else {
			System.out.println("is not secure");
		}
	}
	
	public CustomSecurityConfigurer setFlag(boolean isSecure) {
		this.isSecure = isSecure;
		return this;
	}
}
*/