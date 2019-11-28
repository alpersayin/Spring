package com.alpersayin.calisan.dao;

import java.util.List;

import com.alpersayin.calisan.entity.Calisan;

public interface CalisanDAO {
	
	public List<Calisan> getCalisanlar();
	
	public void saveCalisan(Calisan calisan);
	
	public Calisan getCalisanlar(int calisanId);

	public void deleteCalisan(int calisanId);

	public List<Calisan> searchCalisan(String calisanAra);
}
