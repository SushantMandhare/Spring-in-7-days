package mainapp;

import model.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import service.*;


public class Main {


	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		
		
		Book b =new Book(27,"minijava",1000);
		BookServiceIntf ser = (BookServiceIntf) appContext.getBean("service_decltrans"); 
	//	BookServiceIntf ser = (BookServiceIntf) appContext.getBean("service_progtrans"); 
		
		boolean status;
		try
		{
		status = ser.addBook(b);
		}
		catch(Exception e)
		{
			status=false;
		}
		
		if(status)
		{
			System.out.println("book added sucessfully");
			
		}
		else
		{
			System.out.println("book addition failed");
		}
		
	
		
	}  
	
	
	
}


