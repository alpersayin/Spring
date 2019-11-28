package com.alpersayin.springdemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Abone {
	String name;
	char gender;
	String[] interests;
	String birthCity;
	List<String> birthCities;
	Date birthDate;
	
	public Abone() {
		birthCities = new ArrayList<String>();
		birthCities.add("Ankara");
		birthCities.add("Ýstanbul");
		birthCities.add("Ýzmir");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String getBirthCity() {
		return birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public List<String> getBirthCities() {
		return birthCities;
	}

	public void setBirthCities(List<String> birthCities) {
		this.birthCities = birthCities;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
//	
}
