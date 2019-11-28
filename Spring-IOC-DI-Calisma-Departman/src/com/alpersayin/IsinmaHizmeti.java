package com.alpersayin;

public class IsinmaHizmeti implements DanismanlikHizmeti {

	@Override
	public String ogutAl() {
		return "Hareketten önce ýsýn";
	}
	
	public IsinmaHizmeti() {
		System.out.println("Constructor, Isýnma Hizmeti");
	}

}
