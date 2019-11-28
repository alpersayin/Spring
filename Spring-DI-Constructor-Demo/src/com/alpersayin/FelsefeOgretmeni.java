package com.alpersayin;

public class FelsefeOgretmeni implements Ogretmen {
	
	DanismanlikHizmeti danismanlikhizmeti;
	
	public FelsefeOgretmeni() {
		System.out.println("Constructor, Felsefe Ogretmeni...");
	}
	
	public FelsefeOgretmeni(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Constructur, Felsefe Öðretmeni, Danismanlýk");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}

	@Override
	public String dersAl() {
		return "Felsefem yok";
	}

	@Override
	public String akilAl() {
		// TODO Auto-generated method stub
		return danismanlikhizmeti.ogutAl();
	}

	@Override
	public String koclukAl() {
		// TODO Auto-generated method stub
		return danismanlikhizmeti.koclukAl();
	}

}
