package com.alpersayin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.alpersayin")
public class OgretmenConfig {
	
	@Bean
	public Ogretmen javaHocasi() {
		return new JavaOgretmeni();
	}
	
//
}
