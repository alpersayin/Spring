package com.alpersayin;

public class IsinmaHizmeti implements DanismanlikHizmeti {

	@Override
	public String ogutAl() {
		return "Hareketten �nce �s�n";
	}
	
	public IsinmaHizmeti() {
		System.out.println("Constructor, Is�nma Hizmeti");
	}

}
