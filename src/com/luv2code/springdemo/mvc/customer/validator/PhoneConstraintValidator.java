package com.luv2code.springdemo.mvc.customer.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.luv2code.springdemo.mvc.customer.annotations.Phone;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {

	private String[] phonePrefix;

	@Override
	public void initialize(Phone phone) {
		phonePrefix = phone.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {

		boolean result = false;
		if (theCode != null) {
			for (String list : phonePrefix) {
				result = theCode.startsWith(list);
				if (result == true)
					break;
			}
		} else
			result = false;

		return result;
	}

}
