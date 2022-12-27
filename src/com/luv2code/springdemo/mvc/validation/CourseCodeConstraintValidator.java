package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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
