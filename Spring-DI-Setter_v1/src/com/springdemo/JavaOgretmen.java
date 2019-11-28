package com.springdemo;

public class JavaOgretmen implements Ogretmen {

	private DanismanHizmeti danismanHizmeti;

	public void setDanismanHizmeti(DanismanHizmeti danismanHizmeti) {
		this.danismanHizmeti = danismanHizmeti;
	}

	@Override
	public String dersAl() {
		return "burada mýyýz?";
	}

	@Override
	public String ogutAl() {
		return danismanHizmeti.ogutVer();
	}

}
