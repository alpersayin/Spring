package com.alpersayin.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alpersayin.student.dao.StudentDAO;
import com.alpersayin.student.entity.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}

	@Override
	@Transactional
	public Student getStudents(int studentId) {
		return studentDAO.getStudents(studentId);
	}	

	@Override
	@Transactional
	public void deleteStudent(int studentId) {
		studentDAO.deleteStudent(studentId);
	}

	@Override
	@Transactional
	public List<Student> searchStudent(String searchName) {
		return studentDAO.searchStudent(searchName);
	}
	
	
//	
}
