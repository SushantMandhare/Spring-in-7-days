package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {
	
	public static void main(String arg[])
	{
		try
		{
		ApplicationContext ac=new AnnotationConfigApplicationContext(config.class);
		employee e=(employee)ac.getBean("e1");
		e.toString();
		employee e1=(employee)ac.getBean("e2");
		e1.toString();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
