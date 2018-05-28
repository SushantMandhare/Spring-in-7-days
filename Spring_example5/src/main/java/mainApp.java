package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class mainApp {
	public static void main(String arg[])
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(config.class);
		HelloWorld h=(HelloWorld)ac.getBean("hw");
		h.setMessage("Sushant");
		h.getMessage();
		/*Lazy loading*/
		/*HelloWorld1 h1=(HelloWorld1)ac.getBean("hw1");
		h1.setMessage("Sushant");
		h1.getMessage();*/
	}
}
