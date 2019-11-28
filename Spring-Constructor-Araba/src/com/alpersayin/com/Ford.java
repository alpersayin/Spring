package com.alpersayin.com;

public class Ford implements Araba {

	Benzinli benzinli;
	
	public Ford() {
		// TODO Auto-generated method stub
		System.out.println("Constructor, Ford");
	}

	public Ford(Benzinli benzinli) {
		System.out.println("Constructor, Ford Benzinli");
		this.benzinli = benzinli;
	}

	@Override
	public String hizlan() {
		// TODO Auto-generated method stub
		return "Ford hizlaniyor...";
	}

	@Override
	public String yavasla() {
		// TODO Auto-generated method stub
		return "Ford yavasliyor...";
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return benzinli.start();
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return benzinli.stop();
	}

}
