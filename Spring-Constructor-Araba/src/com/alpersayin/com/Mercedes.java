package com.alpersayin.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mercedes implements Araba {
	
	Dizel dizel;
	
	public Mercedes() {
		// TODO Auto-generated method stub
		System.out.println("Constructor, Mercedes");
	}
	
	@Autowired
	public Mercedes(@Qualifier("dizel") Dizel dizel) {
		System.out.println("Constructor, Mercedes Dizel...");
		this.dizel = dizel;
	}

	@Override
	public String hizlan() {
		// TODO Auto-generated method stub
		return "Mercedes hizlaniyor...";
	}

	@Override
	public String yavasla() {
		// TODO Auto-generated method stub
		return "Mercedes yavasliyor...";
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return dizel.start();
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return dizel.stop();
	}


}
