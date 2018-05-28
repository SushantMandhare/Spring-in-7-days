package jdbc.springmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.springbeans.EnrollRequest;
import jdbc.springjdbc.SpringJDBCDAO;


public class Main {
/*
	public static void main1(String[] args) {
		// Line 1
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		// Line 2
		JdbcTemplate jdbcTemplate = (JdbcTemplate) appContext
				.getBean("jdbcTemplate");
		// Line 3
		String sql = "SELECT count(*) FROM RegisterDate";
		// Line 4
		int count = jdbcTemplate.queryForInt(sql);
		// Line 5
		System.out.println("------>>>>> ====>>>> count :: " + count);
	} */

	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		SpringJDBCDAO springJDBCDAO = (SpringJDBCDAO) appContext
				.getBean("springJDBCDAO");
		
		System.out.println(springJDBCDAO.queryForInt());
		
		springJDBCDAO.insert(1,"b1",20);
		System.out.println(springJDBCDAO.queryForInt());
		springJDBCDAO.UpdatingForInserting();
		
		springJDBCDAO.queryWithRowMapper(); 
		
		
		springJDBCDAO.UpdateForUpdating();
		springJDBCDAO.queryWithRowMapper(); 
		
	}  
	
	
	/*
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring-config-para.xml");
		SpringJDBCNamedParameterDAO springJDBCNamedParameterDAO = (SpringJDBCNamedParameterDAO) appContext
				.getBean("springJDBCNamedParameterDAO");
		springJDBCNamedParameterDAO.namedParameter();
	}  
	
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring-config-para.xml");
		SpringJDBCNamedParameterDAO springJDBCNamedParameterDAO = (SpringJDBCNamedParameterDAO) appContext
				.getBean("springJDBCNamedParameterDAO");
		EnrollRequest enrollRequest = new EnrollRequest();
		enrollRequest.setId(5);
		enrollRequest.setFirstname("Master");
		springJDBCNamedParameterDAO.namedParameter(enrollRequest);
	} 
	

	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring-config-call.xml");

		SpringSimpeJDBC simpeJDBC = (SpringSimpeJDBC)appContext
			.getBean("springSimpeJDBC");
		     simpeJDBC.callWithParameter();
	} 
		*/
}


