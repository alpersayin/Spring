package com.alpersayin.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdditionAspect {
	
	@Pointcut("execution(* *(..))")
	private void allNoParamMethods() {}
	
	@Before("allNoParamMethods()")
	public void beforeAddPersonel(JoinPoint jp) {
		MethodSignature ms = (MethodSignature) jp.getSignature();
		System.out.println("AdditionAspect, bir no param metod çaðrýsý...");
		System.out.println(ms.getName() + "-" + ms.getMethod());
		
		Object[] args = jp.getArgs();
		System.out.print("Params: ");
		for (Object object : args) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

}
