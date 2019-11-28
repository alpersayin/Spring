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

	@Override
	public String koclukAl() {
		// TODO Auto-generated method stub
		return null;
	}

}
