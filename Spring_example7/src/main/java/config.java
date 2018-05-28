package main.java;
import main.interfaces.myDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class config {

	@Bean
	@Primary
	public myDate d()
	{
		return new Birthdate(22,12,1988);
	}
	@Bean
	public myDate d2()
	{
		return new Birthdate(23,12,1988);
	}
	@Bean
	public employee e1(myDate d2)/*Even d2 is called, d is injected because @Primary annotation*/
	{
		return new employee(d2);
	}
	
}
