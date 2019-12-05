package com.alpersayin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student3 {

	private String firstName;
	private String lastName;
	private String city;
	
	private List<String> cities;
	
	public Student3() {
		firstName = "Alper";
		lastName = "Ersayin";
		city = "Ankara";
		cities = new ArrayList<String>();
		cities.add("Ankara");
		cities.add("Malatya");
		cities.add("Antalya");
		cities.add("Çankırı");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
//	
}
