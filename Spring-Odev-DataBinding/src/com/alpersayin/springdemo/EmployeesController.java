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
public class EmployeesController {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    public static final String USER = "hr";
    public static final String PASS = "hr";
    
	public Connection getConnection() {	
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			return connection;
	    } catch (SQLException ex) {
	    	throw new RuntimeException("Error connecting to the database", ex);
	    }
	}
	
	@RequestMapping("/search")
	public String showEmployee(@ModelAttribute("employee") Employees e) throws SQLException {

		Connection connection = getConnection();		
		String sql = "SELECT * "
					+ "FROM EMPLOYEES "
					+ "WHERE EMPLOYEE_ID = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, e.empID);
		
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			e.setEmpID(rs.getInt("EMPLOYEE_ID"));
			e.setEmpFirstName(rs.getString("FIRST_NAME"));
			e.setEmpLastName(rs.getString("LAST_NAME"));
			e.setEmpSalary(rs.getInt("SALARY"));
		}
		
		connection.close();
		return "show-page";
	}
	
	@RequestMapping("/update")
	public String updateEmployee(@ModelAttribute("employee") Employees e, Model model) throws SQLException {
		
		Connection connection = getConnection();
		String sql = "UPDATE EMPLOYEES "
					+ "SET FIRST_NAME=?, LAST_NAME=?, SALARY=? "
					+ "WHERE EMPLOYEE_ID=" + e.empID;
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, e.getEmpFirstName());
		ps.setString(2, e.getEmpLastName());
		ps.setInt(3, e.getEmpSalary());
		
		int i = ps.executeUpdate();
		if (i == 1) {
			//System.out.println(e.getEmpID() + " is updated..");
			String message = "Employee is updated...";
			model.addAttribute("updateMassage", message);
		}
		
		connection.close();
		return "show-page";
	}
//	
}
