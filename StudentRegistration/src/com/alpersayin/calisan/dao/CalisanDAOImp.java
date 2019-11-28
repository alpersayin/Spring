package com.alpersayin.calisan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alpersayin.calisan.entity.Calisan;

@Repository
public class CalisanDAOImp implements CalisanDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Calisan> getCalisanlar() {

		Session session = sessionFactory.getCurrentSession();
		
		Query<Calisan> query = session.createQuery("from Calisan", Calisan.class);
		
		List<Calisan> list = query.getResultList();
		
		return list;
	}

	@Override
	public void saveCalisan(Calisan calisan) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(calisan);
		
	}

	@Override
	public Calisan getCalisanlar(int calisanId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Calisan.class, calisanId);
		
	}

	@Override
	public void deleteCalisan(int calisanId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Calisan where id = :param_id");
		
		query.setParameter("param_id", calisanId);
		
		int rowsDeleted = query.executeUpdate();
		System.out.println(rowsDeleted + " rows deleted.");
	}

	@Override
	public List<Calisan> searchCalisan(String calisanAra) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Calisan> query;
		
		if (calisanAra != null && calisanAra.trim().length() > 0) {
			query = session.createQuery("from Calisan "
					+ "where lower(firstName) like :name or lower(lastName) like :name", Calisan.class);
			query.setParameter("name", "%" + calisanAra.toLowerCase() + "%");
		}
		else {
			query = session.createQuery("from Calisan", Calisan.class);
		}
		
		List<Calisan> calisanlar = query.getResultList();
		
		return calisanlar;
	}
	
		
	
//
}
