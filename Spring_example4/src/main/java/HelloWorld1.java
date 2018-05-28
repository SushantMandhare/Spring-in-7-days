package main.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld1 implements InitializingBean,DisposableBean,ApplicationContextAware{

	public HelloWorld1()
	{
		System.out.println("HelloWorld1 Default Constrctor");
	}
	public HelloWorld1(String fristname)
	{
		System.out.println("HelloWorld1 Constrctor with one param");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("HelloWorld1 afterPropertiesSet method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("HelloWorld1 destroy method");
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("HelloWorld1 setApplicationContext method");
		
	}

}
