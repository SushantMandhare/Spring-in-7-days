package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
	public static void main(String arg[]){
		ApplicationContext ac =new ClassPathXmlApplicationContext("beans.xml");
		Birthdate b=(Birthdate)ac.getBean("b1");
		b.show();//3
		Birthdate b2=(Birthdate)ac.getBean("b2");//1
		Birthdate b3=(Birthdate)ac.getBean("b3");//2
		b3.show();//4
	}

}
