package com.luv2code.springdemo.mvc.customer.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.luv2code.springdemo.mvc.customer.validator.PhoneConstraintValidator;

@Constraint(validatedBy = PhoneConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

	public String[] value();
	public String message();
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};

}
