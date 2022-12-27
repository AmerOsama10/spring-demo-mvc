package com.luv2code.springdemo.mvc.customer.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.luv2code.springdemo.mvc.customer.validator.CourseCodeConstraintValidator;

//contains logic
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
//apply it in methods and fields
@Target({ElementType.METHOD,ElementType.FIELD})
//process it at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//1-define default course code
	public String value() default"LUV";
	
	//2-define default error message
	public String message() default"must start with LUV";
	
	//3-define default groups
	// can group related constraints
	public Class <?>[] groups() default{};
	
	//4-define default payloads
	// provide custom details about validation failure
	public Class <? extends Payload>[] payload() default{};

}
