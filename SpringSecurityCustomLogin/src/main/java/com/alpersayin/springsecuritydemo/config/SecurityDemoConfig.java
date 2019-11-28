package com.alpersayin.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityDemoConfig extends WebSecurityConfigurerAdapter {

	@SuppressWarnings("deprecation")
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("alper").password("ok").roles("ADMIN"))
			.withUser(users.username("omer").password("yes").roles("PERSONEL"))
			.withUser(users.username("caner").password("no").roles("HR"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*
		http
		  .authorizeRequests()
		  	.anyRequest().authenticated()
		.and()
		  .formLogin()
		  	.loginPage("/showCustomLoginPage")
		  	.loginProcessingUrl("/authenticateUser")
		  	.permitAll();
		*/
		http.authorizeRequests().anyRequest().authenticated(); 
		http.formLogin().loginPage("/showCustomLoginPage") // login sayfası mapping
			.loginProcessingUrl("/authenticateUser") // mapping gerektirmez
			.permitAll();
		http.logout()
			.permitAll();
	}
	
//	
}
