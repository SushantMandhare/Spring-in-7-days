package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {

	public static void main(String arg[])
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(config.class);
		Detail d=(Detail)ac.getBean("d");
		d.DisplayInfo();
	}
}
