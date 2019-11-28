package com.alpersayin.student.service;

import java.util.List;

import com.alpersayin.student.entity.Student;

public interface StudentService {

	public List<Student> getStudents();
	
	public void saveStudent(Student student);
	
	public Student getStudents(int studentId);

	public void deleteStudent(int studentId);

	public List<Student> searchStudent(String searchName);
	
//	
}
