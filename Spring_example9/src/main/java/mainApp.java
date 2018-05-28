package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String arg[])
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Detail d=(Detail)ac.getBean("d");
		d.DisplayInfo();
	}
}
