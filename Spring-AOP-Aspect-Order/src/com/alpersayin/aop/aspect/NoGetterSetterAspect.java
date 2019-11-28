package com.alpersayin.aop.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class NoGetterSetterAspect {
	@Pointcut("execution(public * org.omer.aop.dao.*.*(..))")
	private void allDaoPackage() {}
	
	@Pointcut("execution(* org.omer.aop.dao.*.get*())")
	private void getters() {}

	@Pointcut("execution(public * org.omer.aop.*.set*(*))")
	private void setters() {}
	
	@Pointcut("allDaoPackage() && !(getters() || setters())")
	private void allDaoExceptSettersGetters() {}
	
	@Before("allDaoExceptSettersGetters()")
	public void beforeDaoFunctions() {
		
		System.out.println("All but getters&setters");
		
	}
	
	@Before("getters()")
	public void beforeGetter() {
		System.out.println("Getter çalýþtýrýldý");
	}
}
