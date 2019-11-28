package com.alpersayin.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdditionAspect {
	
	@Before("execution(public void addPersonel())")
	public void beforeAddPerson() {
		System.out.println("ASPECT, Personel is adding..");
	}
	
	@Before("execution(* add*())")
	public void beforeAddAll() {
		System.out.println("ASPECT, Something is adding..");
	}
	
//
}
