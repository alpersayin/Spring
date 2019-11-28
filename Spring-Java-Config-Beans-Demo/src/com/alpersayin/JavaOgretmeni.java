package com.alpersayin;

import org.springframework.stereotype.Component;

@Component
public class JavaOgretmeni implements Ogretmen {

	public JavaOgretmeni() {
		System.out.println("Constructor, Java Ogretmeni");
	}
	
	@Override
	public String dersAl() {
		return "Hello Java";
	}

	@Override
	public String akilAl() {
		return "Java Akýl Al";
	}

}
