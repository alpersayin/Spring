package com.alpersayin.calisan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alpersayin.calisan.dao.CalisanDAO;
import com.alpersayin.calisan.entity.Calisan;

@Service
public class CalisanServiceImp implements CalisanService {

	@Autowired
	private CalisanDAO calisanDAO;
	
	@Override
	@Transactional
	public List<Calisan> getCalisanlar() {
		return calisanDAO.getCalisanlar();
	}

	@Override
	@Transactional
	public void saveCalisan(Calisan calisan) {
		calisanDAO.saveCalisan(calisan);
	}

	@Override
	@Transactional
	public Calisan getCalisanlar(int calisanId) {
		return calisanDAO.getCalisanlar(calisanId);
	}

	@Override
	@Transactional
	public void deleteCalisan(int calisanId) {
		calisanDAO.deleteCalisan(calisanId);
	}

	@Override
	@Transactional
	public List<Calisan> searchCalisan(String calisanAra) {
		return calisanDAO.searchCalisan(calisanAra);
	}

}
