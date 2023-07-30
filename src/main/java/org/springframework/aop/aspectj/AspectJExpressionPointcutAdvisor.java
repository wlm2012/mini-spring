package org.springframework.aop.aspectj;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

/**
 * aspectJ表达式的advisor
 *
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

	private AspectJExpressionPointcut pointcut;

	private Advice advice;

	private String expression;

	public void setExpression(String expression) {
		this.expression = expression;
		pointcut = new AspectJExpressionPointcut(expression);
	}

	@Override
	public Pointcut getPointcut() {
		return pointcut;
	}

	@Override
	public Advice getAdvice() {
		return advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}
}