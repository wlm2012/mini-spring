package org.springframework.test.common;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class WorldServiceInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Do something before the earth explodes");
		Object result = invocation.proceed();
		System.out.println("Do something after the earth explodes");
		return result;
	}
}