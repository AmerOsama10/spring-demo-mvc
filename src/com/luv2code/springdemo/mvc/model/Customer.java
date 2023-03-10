package com.luv2code.springdemo.mvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.customer.annotations.CourseCode;
import com.luv2code.springdemo.mvc.customer.annotations.Phone;


public class Customer {

	private String firstName;
	
	@Size(min = 1)
	@NotNull(message = "is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 0, message = "must be greater than or equal to zero")
	@Max(value = 10, message = "must be smaller than or equal to 10")
	private Integer freePasses;
	
	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value="A",message="must start with A")
	private String courseCode;
	
	@Phone(value={"A","B"},message="must start with A Or B")
	private String phone;

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

	

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
