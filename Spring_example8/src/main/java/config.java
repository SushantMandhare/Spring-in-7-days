package main.java;
import main.interfaces.myDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class config {

	@Bean
	@Primary
	//@Qualifier("asd")
	public myDate d()
	{
		return new Birthdate(22,12,1988);
	}
	@Bean
	//@Primary
	@Qualifier("asd")
	public myDate d2()
	{
		return new Birthdate(23,12,1988);
	}
	@Bean
	public employee e1(myDate d2)/*Even d2 is called, d is injected because @Primary annotation*/
	{
		return new employee(d2);
	}
	@Bean
	public employee e2()
	{
		return new employee();
	}
	
}
