package com.alpersayin.springdemo.validation;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RestDayValitador implements ConstraintValidator<RestDay, String>{

	static Set<String> daysOfWeek = new HashSet<>();
	
	static {
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
	}
	
	@Override
	public boolean isValid(String day, ConstraintValidatorContext validatorContext) {
		return daysOfWeek.contains(day);
	}

	
	
//
}
