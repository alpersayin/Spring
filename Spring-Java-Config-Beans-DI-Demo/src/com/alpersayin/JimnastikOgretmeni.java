package com.alpersayin;

public class JimnastikOgretmeni implements Ogretmen {
	
	DanismanlikHizmeti danismanlikhizmeti;
	
	public JimnastikOgretmeni(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Constructor, Jimnastik Ogretmeni, Danismanlik");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}

	@Override
	public String dersAl() {
		return "Biraz esneyelim";
	}

	@Override
	public String akilAl() {
		return danismanlikhizmeti.ogutAl();
	}

}
