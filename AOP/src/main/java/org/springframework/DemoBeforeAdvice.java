package org.springframework;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



public class DemoBeforeAdvice implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before method: " + method.getName());
	}
}
