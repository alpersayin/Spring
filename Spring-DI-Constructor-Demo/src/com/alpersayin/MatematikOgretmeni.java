package com.alpersayin;

public class MatematikOgretmeni implements Ogretmen {
	
	DanismanlikHizmeti danismanlikhizmeti;
	
	public MatematikOgretmeni() {
		System.out.println("Constructor, Matematik Ogretmeni...");
	}
	
	public MatematikOgretmeni(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Constructur, Matematij Öðretmeni, Danismanlýk");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}

	@Override
	public String dersAl() {
		return "Sað baþtan say";
	}

	@Override
	public String akilAl() {
		// TODO Auto-generated method stub
		return danismanlikhizmeti.ogutAl();
	}

	@Override
	public String koclukAl() {
		// TODO Auto-generated method stub
		return null;
	}


	
//
}
