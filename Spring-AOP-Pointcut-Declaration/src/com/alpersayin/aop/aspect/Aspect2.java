package com.alpersayin.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class Aspect2 {
	
	@Pointcut("execution(* * ())")
	public void allMethods() {
		
	}
	
	@Before("allMethods()")
	public void beforeAddAll() {
		System.out.println("ASPECT2, ekleniyor..");
	}
}
