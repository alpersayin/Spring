package com.bilgeadam.springrestdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bilgeadam.springrestdemo.entity.Department;

@Repository
public class DepartmentDAOImp implements DepartmentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Department> getDepartments() {

		Session session = sessionFactory.getCurrentSession();

		Query<Department> query = session.createQuery("from Department order by id", Department.class);

		List<Department> departments = query.getResultList();

		return departments;
	}

	@Override
	public void saveDepartment(Department department) {

		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(department);

	}

	@Override
	public Department getDepartment(int departmentId) {

		Session session = sessionFactory.getCurrentSession();

		return session.get(Department.class, departmentId);
	}

	@Override
	public void deleteDepartment(int departmentId) {

		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Department" + " where id = :param_id");

		query.setParameter("param_id", departmentId);

		// query.executeUpdate(); normalde sadece bunu yazsan yeter a�a��daki bo� ka�
		// kay�t silindi diycez.

		int rowsDeleted = query.executeUpdate();
		System.out.println(rowsDeleted + " rows deleted");

	}

	@Override
	public List<Department> searchDepartments(String searchName) {

		Session session = sessionFactory.getCurrentSession();

		// Query query ; yapt�k normalde
		Query<Department> query;

		if (searchName != null && searchName.trim().length() > 0) {
			// name parameter
			query = session.createQuery("from Department where lower(departmentName) like :name ", Department.class);
			query.setParameter("name", "%" + searchName.toLowerCase() + "%"); // b�y�k k���k harf devreden ��ks�n
																				// yani.K���k harf yapcak her
																				// t�rl�.Ba��ndan veya sonunndan bakcak
																				// % lerden dolay�.
		} else {
			// bo� girdi hi�bir �ey yapmad� yani hepsini getiricez.
			query = session.createQuery("from Department", Department.class);
		}

		List<Department> departments = query.getResultList();

		return departments;
	}

}
