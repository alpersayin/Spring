package com.alpersayin.springdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentsController {
	
	@RequestMapping("/search")
	public String searchDepartment(@ModelAttribute("department") Departments dep, Model model) throws SQLException {
		//Departments department = new Departments();
		
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";		
		Connection myConn = DriverManager.getConnection(dbUrl, "hr","hr");
		PreparedStatement ps = myConn.prepareStatement("SELECT * "
				+ "FROM DEPARTMENTS "
				+ "WHERE DEPARTMENT_ID = ?");
		
		ps.setInt(1, dep.getDepID());
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			/*
			department.setDepID(rs.getInt("department_id"));
			department.setDepName(rs.getString("department_name"));
			department.setManagerID(rs.getInt("manager_id"));
			department.setLocationID(rs.getInt("location_id"));
			*/
			//model.addAttribute("department_id", rs.getInt(1));
			model.addAttribute("department_name", rs.getString(2));
		}
		return "departman-arama";
	}
}
