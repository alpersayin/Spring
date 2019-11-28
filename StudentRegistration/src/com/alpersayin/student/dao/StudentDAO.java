package com.alpersayin.student.dao;

import java.util.List;

import com.alpersayin.student.entity.Student;

public interface StudentDAO {

	public List<Student> getStudents();

	public void saveStudent(Student student);

	public Student getStudents(int studentId);

	public void deleteStudent(int studentId);

	public List<Student> searchStudent(String searchName);
	
//	
}
