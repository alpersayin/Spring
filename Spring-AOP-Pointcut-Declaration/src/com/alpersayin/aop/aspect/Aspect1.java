package com.alpersayin.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(5)
public class Aspect1 {
	
	@Before("execution(* add())")
	private void beforeAddAll() {
		System.out.println("Aspect1 , ekleniyor..");
	}
	
	@Before("com.alpersayin.aop.aspect.Aspect2.allMethods()")
	private void beforeEvery() {
		System.out.println("Aspect1 , herþey için çalýþýyor ekleniyor..");
	}
}
