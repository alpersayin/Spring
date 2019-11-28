package com.alpersayin;

public class Employee {
	String firstname;
	String lastname;
	Integer salary;
	Department dep;
	
	public Employee() {
		System.out.println("Constructor, Employee...");
	}
	
	public Employee(String firstname, String lastname, Integer salary, Department dep) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.dep = dep;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + ", dep=" + dep
				+ "]";
	}

	
//
}
