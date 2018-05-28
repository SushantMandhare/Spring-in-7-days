package main.java;

import org.springframework.stereotype.Component;

@Component("hw")
public class HelloWorld {
	private String Message;
	public HelloWorld()
	{
		System.out.println("Hello World Constructor");
	}
	
	public String getMessage() {
		System.out.println("Hello World "+Message);
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}	
}
