package com.alpersayin.springdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RestDayValitador.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RestDay {

	// default
	public String value() default "Sunday";
	
	// default error messages
	public String message() default "Valid days are : Monday to Sunday";
	
	// default groups --> ilgili constrainleri gruplamak için
	public Class<?>[] groups() default{};
	
	// default payloads --> validasyon gerçekleþmeme nedeni 
	// ifade eden detaylar, security level, error code vs
	public Class<? extends Payload>[] payload() default{};

}
