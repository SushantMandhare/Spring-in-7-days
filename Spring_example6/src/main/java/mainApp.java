package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
	public static void main(String arg[])
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(config.class);
		HelloWorld h=(HelloWorld)ac.getBean("getHelloWorld");
		h.setMessage("Sushant");
		h.getMessage();
		HelloWorld h1=(HelloWorld)ac.getBean("getHelloWorld");
		if(h == h1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
