package com.alpersayin.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alpersayin.student.entity.Student;
import com.alpersayin.student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/list")
	public String listStudents(Model model) {
		
		List<Student> myStudents = studentService.getStudents();
		
		model.addAttribute("students", myStudents);
		
		return "list-students";
	}
	
	@GetMapping("/addStudentForm")
	public String addStudentForm(Model model) {
		
		Student std = new Student();
		std.setFirstName("ALPER");
		model.addAttribute("student", std);
		
		return "student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		
		return "redirect:/student/list";
	}
	
	@GetMapping("/updateStudentForm")
	public String updateStudentForm(@RequestParam("studentId") int studentId, Model model) {
		
		Student student = studentService.getStudents(studentId);
		model.addAttribute(student);
		
		return "student-form";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("studentId") int studentId) {
		
		studentService.deleteStudent(studentId);
		
		return "redirect:/student/list";
	}
	
	@GetMapping("/searchStudent")
	public String searchStudent(@RequestParam("searchName") String searchName, Model model) {
		
		List<Student> students = studentService.searchStudent(searchName);
		model.addAttribute("students", students);
		
		return "list-students";
	}
	
//
}
