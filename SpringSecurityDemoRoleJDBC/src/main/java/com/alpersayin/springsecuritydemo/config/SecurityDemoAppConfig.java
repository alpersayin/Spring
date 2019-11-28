package com.alpersayin.springsecuritydemo.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.alpersayin.springsecuritydemo")
@PropertySource("classpath:db.properties")
public class SecurityDemoAppConfig implements WebMvcConfigurer {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean
	public DataSource loginDS() {
		ComboPooledDataSource loginDS = new ComboPooledDataSource();
		try {
			loginDS.setDriverClass(environment.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			throw new RuntimeException();
		}
		loginDS.setJdbcUrl(environment.getProperty("jdbc.url"));
		loginDS.setUser(environment.getProperty("jdbc.username"));
		loginDS.setPassword(environment.getProperty("jdbc.password"));
		
		loginDS.setInitialPoolSize(Integer.parseInt(environment.getProperty("connection.pool.initialPoolSize")));
		loginDS.setMinPoolSize(Integer.parseInt(environment.getProperty("connection.pool.minPoolSize")));
		loginDS.setMaxPoolSize(Integer.parseInt(environment.getProperty("connection.pool.maxPoolSize")));
		loginDS.setMaxIdleTime(Integer.parseInt(environment.getProperty("connection.pool.maxIdleTime")));
		
		return loginDS;
	}
		
//	
}
