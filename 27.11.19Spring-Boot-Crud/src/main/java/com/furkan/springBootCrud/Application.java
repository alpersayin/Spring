package com.furkan.springBootCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) eğer database kullanmıyorsak bunu ekleyebilirsin
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
