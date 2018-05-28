package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Model.Employee;

public class empDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void execute()
	{
		if(jdbcTemplate == null ){
			System.out.print("null");
		}
		jdbcTemplate.execute("create table Emp2(id integer,empName varchar(30),salary integer)");
	}
	public int totalRows()
	{
		return jdbcTemplate.queryForInt("select count(*) from Emp2");
	}
	public void insert(int id,String name,int salary)
	{
		String query="insert into Emp2 values(?,?,?)";
		int count=jdbcTemplate.update(query,id,name,salary) ;
		System.out.println(count+" rows inserted");
	}
	public void update(String name,int id)
	{
		String query="update Emp2 set empName=? where empid=?";
		int count=jdbcTemplate.update(query,name,id) ;
		System.out.println(count+" rows updated");
	}
	public void delete(int id)
	{
		String query="delete from Emp2 where empid=?";
		int count=jdbcTemplate.update(query,id) ;
		System.out.println(count+" rows deleted");
	}
	public ArrayList<Employee> selectAll()
	{
		String query="select * from Emp2";
		java.util.List<Employee> objectList = jdbcTemplate.query(query,
				new RowMappers());
		System.out.println("------------Table DATA START-------------");
		for (Employee e : objectList) {
			System.out.println(e.getEmpid() + "\t"
					+ e.getEmpName() + "\t"
					+ e.getSalary());
		}
		System.out.println("------------Table DATA END-------------");
		return (ArrayList<Employee>) objectList;
	}
	class RowMappers implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int rowNumber)
				throws SQLException {
			Employee b = new Employee();
			b.setEmpid(rs.getInt(1));
			b.setEmpName(rs.getString(2));
			b.setSalary(Integer.parseInt(rs.getString(3)));
			return b;
		}
	}
}
