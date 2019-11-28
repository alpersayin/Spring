package com.alpersayin.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdditionAspect {
	
	@Pointcut("execution(* *(..))")
	private void allMethods() {}
	
	@AfterThrowing(pointcut = "allMethods()", throwing = "excp")
	public void afterThrowingAllMethods(JoinPoint jp, Throwable excp) {

		System.out.println("afterThrowingAllMethods, bir metod hatasý...");
		
		System.out.println("Hata: " + excp.getMessage());
		
	}

	@AfterReturning("allMethods()")
	private void afterReturningAllMethods() {
		System.out.println("afterReturningAllMethods, baþarýlý bir method çaðrýsý..");
	}
	
	@After("allMethods()")
	private void afterAllMethods() {
		System.out.println("After, bir method çaðrýsý..");
	}
	
}
