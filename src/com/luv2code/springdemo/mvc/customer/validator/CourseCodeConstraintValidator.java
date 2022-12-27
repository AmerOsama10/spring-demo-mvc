package com.luv2code.springdemo.mvc.customer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.luv2code.springdemo.mvc.customer.annotations.CourseCode;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}

	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean result ;
		if(value !=null)
			result=value.startsWith(coursePrefix);
		else
			result=false;
		return result;
	}


}
