package com.alpersayin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OgretmenConfig {
	
	@Bean
	public DanismanlikHizmeti isitBiziHoca() {
		return new IsinmaHizmeti();
	}
	
	@Bean
	public Ogretmen jimnastikHocasi() {
		return new JimnastikOgretmeni(isitBiziHoca());
	}
	
	@Bean
	public Ogretmen javaHocasi() {
		return new JavaOgretmeni();
	}
	
//
}
