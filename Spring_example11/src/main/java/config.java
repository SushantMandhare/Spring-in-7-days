package main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;


@Configuration
@EnableAspectJAutoProxy
//@ImportResource("classpath:beans.xml")
public class config {
	
	@Bean
	public Employee e1()
	{
		return new Employee();
	}
	@Bean
	public LogAspect l()
	{
		return new LogAspect();
	}
}
