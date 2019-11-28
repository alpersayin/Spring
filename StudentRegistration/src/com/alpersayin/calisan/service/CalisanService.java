package com.alpersayin.calisan.service;

import java.util.List;

import com.alpersayin.calisan.entity.Calisan;

public interface CalisanService {
	
	public List<Calisan> getCalisanlar();
	
	public void saveCalisan(Calisan calisan);
	
	public Calisan getCalisanlar(int calisanId);

	public void deleteCalisan(int calisanId);

	public List<Calisan> searchCalisan(String calisanAra);

}
