package main.java;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*Multi pointcut expression and single point cut exp*/
@Aspect
public class LogAspect {
	
	@Pointcut("execution(* main.java.Employee.DisplayInfo())")
	public void singlePointcut()
	{
		
	}
	
	@Before("singlePointcut()")
	///@Before("execution(* main.java.Employee.DisplayInfo())")
	public void beforeLog(JoinPoint jp)
	{
		System.out.println("inside beforeLog singlePointcut..."+jp.getSignature().getDeclaringTypeName());
	} 
	
	@Before("execution(* main.java.Employee.DisplayInfoByParam(String)) && args(ect)")
	public void beforeLog(String ect)
	{
		System.out.println("inside beforeLog ..."+ect);
	}
	
	@AfterReturning(pointcut="execution(* main.java.Employee.DisplayInfo())",
			returning="result")
	public void afterReturning(Object result)
	{
		System.out.println("inside AfterReturning ..."+result);
	}
	@AfterThrowing(pointcut="execution(* main.java.Employee.DisplayInfo())",
			       throwing="error")
	public void afterThrowing(Throwable error)
	{
		System.out.println("inside afterThrowing ..."+error);
	}
	
	@After("execution(* main.java.Employee.DisplayInfo())")
	public void afterLog()
	{
		System.out.println("inside afterLog ...");
	}
	//@Around("execution(* main.java.Employee.DisplayInfo())")
	@Around("singlePointcut()")
	public void aroundLog(ProceedingJoinPoint jp) throws Throwable
	{
		System.out.println("inside @Around 1 ...");
		jp.proceed();
		System.out.println("inside @Around 2...");
	}
	
}


