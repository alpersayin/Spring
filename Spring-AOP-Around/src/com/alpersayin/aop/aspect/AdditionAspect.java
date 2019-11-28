package com.alpersayin.aop.aspect;

import java.util.concurrent.TimeUnit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdditionAspect {
	
	@Pointcut("execution(* *(..))")
	private void allMethods() {}
	
	@Around("allMethods()")
	public Object aroundAllMethods(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("Around, before");
		Object result = pjp.proceed();
		System.out.println("Around, after");
		
		return result;
	}
	
	@Around("execution(* add*(..))")
	public Object aroundAddMethods(ProceedingJoinPoint pjp) throws Throwable {
		
		long begin = System.currentTimeMillis();
		
		TimeUnit.SECONDS.sleep(3);
		Object result = pjp.proceed();
		
		long end = System.currentTimeMillis();
		long interval = end-begin;
		System.out.println(pjp.getSignature().toShortString() + " Süre: " + interval);
		
		return result;
	}

}
