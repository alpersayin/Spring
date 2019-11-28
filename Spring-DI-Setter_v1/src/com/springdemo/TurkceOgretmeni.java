package com.springdemo;

public class TurkceOgretmeni implements Ogretmen{

	private DanismanHizmeti danismanHizmeti;

	public TurkceOgretmeni(DanismanHizmeti danismanHizmeti) {
		super();
		this.danismanHizmeti = danismanHizmeti;
	}

	@Override
	public String ogutAl() {
		return danismanHizmeti.ogutVer();
	}
	
	@Override
	public String dersAl() {
		// TODO Auto-generated method stub
		return "-de ayrý yazýlýr";
	}
	
//	
}
