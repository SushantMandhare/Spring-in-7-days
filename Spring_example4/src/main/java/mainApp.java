package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
public static void main(String arg[])
{
	AbstractApplicationContext ac=new ClassPathXmlApplicationContext("resource/beans.xml");
	helloWorld h=(helloWorld)ac.getBean("hw");
	h.getMessage();
	
	
	HelloWorld1 h1=(HelloWorld1)ac.getBean("hw1");
	ac.registerShutdownHook();
}
}
