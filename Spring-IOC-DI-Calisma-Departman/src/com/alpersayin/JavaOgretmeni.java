package com.alpersayin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaOgretmeni implements Ogretmen {
	
	@Value("${javaci.email}")
	String email;
	@Value("${javaci.telefon}")
	String telefon;

	public JavaOgretmeni() {
		System.out.println("Constructor, Java Ogretmeni");
	}
	
	@Override
	public String dersAl() {
		return "Hello Java " + email + " " + telefon;
	}

	@Override
	public String akilAl() {
		return "Java Akýl Al";
	}

}
