package main.java;

public class HelloWorld {
	private String Message;
	public HelloWorld()
	{
		System.out.println("Hello World constructor");
	}
	public String getMessage() {
		System.out.println("Hello World "+Message);
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}	
}
