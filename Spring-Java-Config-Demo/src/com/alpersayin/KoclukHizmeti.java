package com.alpersayin;

import org.springframework.stereotype.Component;

@Component
public class KoclukHizmeti implements DanismanlikHizmeti {

	public KoclukHizmeti() {
		// TODO Auto-generated method stub
		System.out.println("Constructor, Kocluk Hizmeti...");
	}	
	
	@Override
	public String ogutAl() {
		// TODO Auto-generated method stub
		return "dont give up";
	}

//
}
