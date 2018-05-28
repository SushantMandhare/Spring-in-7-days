package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String arg[])
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("band.xml");
		Band b=(Band)ac.getBean("b1");
		b.SingSong();
		ArrayList<book> bk=(ArrayList)b.getBook();
		for(book l:bk)
		{
			System.out.println("Book "+l.getBookname());
		}
		
		Band b1=(Band)ac.getBean("b2");
		for(String nam:b1.getBookname())
		{
			System.out.println("Book "+nam);
		}
		b1.SingSong();
	}
}
