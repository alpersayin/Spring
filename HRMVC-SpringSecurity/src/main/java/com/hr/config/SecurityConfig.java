package com.hr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@SuppressWarnings("deprecation")
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("alper").password("123").roles("READ_ONLY","FULL"))
			.withUser(users.username("caner").password("123").roles("READ_ONLY"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/").hasRole("READ_ONLY");
		
		http.authorizeRequests()
		.antMatchers("/department/**").hasRole("FULL")
		.antMatchers("/department/**").hasRole("READ_ONLY")
		;
		
		http.formLogin()
		  	.loginPage("/showLoginPage")
		  	.loginProcessingUrl("/authenticateUser")
		  	.permitAll();
			
		http.logout()
		.permitAll();
		
	}
	
//	
}
