package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
	
	public static void main(String arg[])
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		BookDao b=(BookDao)ac.getBean("bookd");
		System.out.println("Count "+b.totalRows());
		b.insert(0,"a1",10);
		b.insert(1,"b1",20);
		b.insert(2,"c1",30);
		b.selectAll();
		b.update("d1",1);
		b.selectAll();
		System.out.println("Before delete count"+b.totalRows());
		b.delete(2);
		System.out.println("After delete count"+b.totalRows());
		b.selectAll();
	}
}
