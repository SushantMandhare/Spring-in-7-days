package main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class config1 {

	@Bean
	@Primary
	public Employee e4()
	{
		return new Employee("Mandhare");
	}
	@Bean
	@Primary
	public Project p4()
	{
		return new Project("LnG");
	}
}
