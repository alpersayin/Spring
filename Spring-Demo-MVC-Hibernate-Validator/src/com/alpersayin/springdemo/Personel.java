package com.alpersayin.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import com.alpersayin.springdemo.validation.RestDay;

public class Personel {
	
	private String firstName;
	@NotEmpty(message = "This field must be filled in.")
	private String lastName;
	@Range(min=100, max=10000)
	@Min(value=500, message = "Min 500 olmalý")
	@Max(value=5000, message = "Max 5000 olmalý")
	private int salary;
	@Pattern(regexp = "^[A-Z0-9]{5}", message = "Sadece büyük harf ve rakamlar")
	private String postBox;
	private Integer age;
	@RestDay
	private String restDay;
	
	public String getRestDay() {
		return restDay;
	}
	public void setRestDay(String restDay) {
		this.restDay = restDay;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPostBox() {
		return postBox;
	}
	public void setPostBox(String postBox) {
		this.postBox = postBox;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
//	
}
