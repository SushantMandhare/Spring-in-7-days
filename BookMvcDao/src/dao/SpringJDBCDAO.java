package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import model.Book;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import model.Book;


public class SpringJDBCDAO {

	private JdbcTemplate jdbcTemplate;

	public int queryForInt() {
		
		String sql = "SELECT count(*) FROM Book";
		int count = jdbcTemplate.queryForInt(sql);
		return count;
	}

	

	public void queryWithRowMapper() {
		
		String sql = "SELECT * FROM Book";
		
		List<Book> BookList = jdbcTemplate.query(sql,
				new RowMappers());
		
		for (Book b : BookList) {

			System.out.println(b.getId() + "\t"
					+ b.getBookname() + "\t"
					+ b.getBookprice());
					
		}
	}

	public void queryWithWhereClause(int id) {
	
		String sql = "SELECT * FROM Book where id = ?";
	
		List<Book> BookList = jdbcTemplate.query(sql,
				new Object[] { new Integer(id) }, new RowMappers());
	
		
		for (Book b : BookList) {

			System.out.println(b.getId() + "\t"
					+ b.getBookname() + "\t"
					+ b.getBookprice()+"\t");
					
		}
	}
	
	public void queryForObject(int id) {
		
		String sql = "SELECT bookname FROM book where id = ?";
		
		String bookname = jdbcTemplate.queryForObject(sql,new Object[]{new Integer(id)} ,String.class);
	
		System.out.println("bookname"+bookname);
	}
	
	public void insert(int id,String bname,int price) {
	
		String sql = "insert into Book(id,bookname,bookprice) values(?,?,?)";
	
		int count = jdbcTemplate.update(sql, id,bname,price);
		
		System.out.println(count + " row inserted");
	}

	public void update(String bookname,int id) {
	
		String sql = "update Book set bookname=? where id = ? ";
	
		int count = jdbcTemplate.update(sql, bookname,new Integer(id));
	
		System.out.println( count+" row updated");
	}
	
	
	public void delete(int id) {
	
		String sql = "delete from Book where id = ? ";
	
		int count = jdbcTemplate.update(sql,new Integer(id));
		
		System.out.println(count+" row deleted");
	}
	

	
	
	class RowMappers implements RowMapper<Book> {

		public Book mapRow(ResultSet rs, int rowNumber)
				throws SQLException {
			Book b = new Book();
			b.setId(rs.getInt(1));
			b.setBookname(rs.getString(2));
			b.setBookprice(rs.getInt(3));
			
			return b;
		}

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
