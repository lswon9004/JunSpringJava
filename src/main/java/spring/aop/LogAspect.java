package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution(public * *(..))")
	private void pointcut() {}
	
	@Before("pointcut()")
	public void beforeLogging() {
		System.out.println("** 메서드 호출 전**");
	}
	@AfterReturning(pointcut = "pointcut()",returning = "returnValue")
	public void afterLogging(Object returnValue) {
		System.out.println("** 메서드 호출 후**");
	}
	@AfterThrowing(pointcut = "execution(public * *bye(..))", throwing = "ex")
	public void throwingLogging(Exception ex) {
		System.out.println("** 예외 발생 : " + ex.getMessage() + "**");
	}
	@After("pointcut()")
	public void alwaysLogging() {
		System.out.println("** 항상 실행 **");
	}
}