package com.alpersayin.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdditionAspect {
	
	@Pointcut("execution(* *(..))")
	private void allMethods() {}
	
	@AfterReturning("allMethods()")
	public void afterReturningAllMethods(JoinPoint jp) {

		System.out.println("afterReturningAllMethods, bir metod çaðrýsý...");

	}
	
	@AfterReturning(pointcut = "execution(Integer *(..))", returning = "result")
	public void afterReturningIntMethods(JoinPoint jp, Integer result) {

		System.out.println("afterReturningIntMethods, bir Integer metod çaðrýsý...");
		System.out.println("Result: " + result);
		result++;
	}

}
