package main.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;


public class helloWorld implements BeanFactoryAware{

	private String Message;

	public String getMessage() {
		System.out.println("getMessage Method");
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	public void init()
	{
		System.out.println("Init Method");
	}
	public void destroy()
	{
		System.out.println("destroy Method");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory Method");
		
	}

}
