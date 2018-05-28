package main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(config1.class)
@ImportResource("classpath:beans.xml")
public class config {

	@Bean
	public Employee e0()
	{
		return new Employee("Sushant");
	}
	@Bean
	public Project p0()
	{
		return new Project("Rider");
	}
	
	@Bean
	public Detail d(Employee e,Project p)
	{
		return new Detail(e,p);
	}
}
