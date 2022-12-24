package com.luv2code.springdemo.model;

import java.util.LinkedHashMap;

public class Student {
	String name;
	String age;
	// we can select only one gender
	String gender;
	// we can select only one country within the LinkedHashMap
	String country;
	LinkedHashMap<String, String> countryOptions;
	String Course;
	// we can select multiple operating system
	String[] operatingSystem;

	public Student(){
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("EG", "Egypt");
		countryOptions.put("USA", "United States");
		countryOptions.put("GE", "Germany");

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
