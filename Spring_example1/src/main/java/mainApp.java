package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
	
	public static void main(String arg[])
	{
		try
		{
		ApplicationContext ac=new ClassPathXmlApplicationContext("emp.xml");
		employee e=(employee)ac.getBean("e1");
		e.toString();
		employee e1=(employee)ac.getBean("e1");
		if(e == e1)
		{
			System.out.println("true");
		}
		else/*scope="prototype"*/
		{
			System.out.println("false");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
