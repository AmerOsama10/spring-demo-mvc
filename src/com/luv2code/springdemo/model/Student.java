package com.luv2code.springdemo.model;

import java.util.LinkedHashMap;

public class Student {
	String name;
	String age;
	String gender;
	String counrty;
	LinkedHashMap<String, String> countryOptions;
	
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

	public String getCounrty() {
		return counrty;
	}

	public void setCounrty(String counrty) {
		this.counrty = counrty;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

}
