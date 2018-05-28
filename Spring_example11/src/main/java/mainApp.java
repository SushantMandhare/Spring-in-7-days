package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {

	public static void main(String arg[])
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(config.class);
		Employee e=(Employee)ac.getBean("e1");
		e.setFirstName("Sushant");
		e.setLastName("Mandhare");
		e.DisplayInfo();
		e.DisplayInfoByParam("*param* ");
	}
}
