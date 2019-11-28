package com.alpersayin.springdemo;

import java.util.ArrayList;
import java.util.List;

public class Anket {
	
	private static String firstName;
	private static String lastName;
	private static char gender;
	private static int age;
	
	private static String schoolName;
	private static String graduateType;
	private static List<String> graduateTypes;
	private static int graduateYear;
	
	private static String[] driverLicenses;
	private static String bloodType;
	private static List<String> bloodTypes;
	private static String[] interests;
	
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getGraduateType() {
		return graduateType;
	}
	public void setGraduateType(String graduateType) {
		this.graduateType = graduateType;
	}
	public List<String> getGraduateTypes() {
		return graduateTypes;
	}
	public void setGraduateTypes(List<String> graduateTypes) {
		this.graduateTypes = graduateTypes;
	}
	public int getGraduateYear() {
		return graduateYear;
	}
	public void setGraduateYear(int graduateYear) {
		this.graduateYear = graduateYear;
	}
	public String[] getDriverLicenses() {
		return driverLicenses;
	}
	public void setDriverLicenses(String[] driverLicenses) {
		this.driverLicenses = driverLicenses;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public List<String> getBloodTypes() {
		return bloodTypes;
	}
	public void setBloodTypes(List<String> bloodTypes) {
		this.bloodTypes = bloodTypes;
	}
	public String[] getInterests() {
		return interests;
	}
	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public Anket() {
		bloodTypes = new ArrayList<String>();
		bloodTypes.add("A");
		bloodTypes.add("B");
		bloodTypes.add("0");
		bloodTypes.add("AB");
		
		graduateTypes = new ArrayList<String>();
		graduateTypes.add("B.S.");
		graduateTypes.add("M.S.");
		graduateTypes.add("PhD.");
	}
}
