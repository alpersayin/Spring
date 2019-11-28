package com.alpersayin.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alpersayin.student.entity.Student;

@Repository
public class StudentDAOImp implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Student> getStudents() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Student> query = session.createQuery("from Student", Student.class);
		
		List<Student> students = query.getResultList();
		
		return students;
	}

	@Override
	public void saveStudent(Student student) {

		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(student);
	}

	@Override
	public Student getStudents(int studentId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Student.class, studentId);
	}

	@Override
	public void deleteStudent(int studentId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Student where id = :param_id");
		
		query.setParameter("param_id", studentId);
		
		int rowsDeleted = query.executeUpdate();
		System.out.println(rowsDeleted + " rows deleted.");
	}

	@Override
	public List<Student> searchStudent(String searchName) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Student> query;
		
		if (searchName != null && searchName.trim().length() > 0) {
			query = session.createQuery("from Student "
					+ "where lower(firstName) like :name or lower(lastName) like :name", Student.class);
			query.setParameter("name", "%" + searchName.toLowerCase() + "%");
		} 
		else {
			query = session.createQuery("from Student", Student.class);
		}
		
		List<Student> students = query.getResultList();
		
		return students;
	}

	
//	
}
