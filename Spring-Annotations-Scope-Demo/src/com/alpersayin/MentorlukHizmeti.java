package com.alpersayin;

import org.springframework.stereotype.Component;

//@Component
public class MentorlukHizmeti implements DanismanlikHizmeti {

	public MentorlukHizmeti() {
		// TODO Auto-generated method stub
		System.out.println("Constructor, Mentroluk Hizmeti...");
	}
	
	@Override
	public String ogutAl() {
		// TODO Auto-generated method stub
		return "çok çalýþ brom";
	}

	@Override
	public String koclukAl() {
		// TODO Auto-generated method stub
		return "koçum!!";
	}
	
	

}
