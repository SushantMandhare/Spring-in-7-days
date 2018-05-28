package main.java;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("hw1")
@Lazy
public class HelloWorld1 {
	private String Message;
	public HelloWorld1()
	{
		System.out.println("Hello World 1 Constructor");
	}
	public String getMessage() {
		System.out.println("Hello World "+Message);
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}	
}
