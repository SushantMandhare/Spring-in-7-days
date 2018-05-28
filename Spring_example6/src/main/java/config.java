package main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class config {

	@Bean
	/* XML bean declaration 
	 * <bean id="getHelloWorld" class="main.java.HelloWorld" />*/
	public HelloWorld getHelloWorld()
	{
		return new HelloWorld();
	}
}
