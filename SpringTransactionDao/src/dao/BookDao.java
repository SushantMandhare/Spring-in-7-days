package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Book;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class BookDao extends JdbcDaoSupport{

	

	public int queryForInt() {
		
		String sql = "SELECT count(*) FROM Book1";
		int count = this.getJdbcTemplate().queryForInt(sql);
		return count;
	}

	

	public void queryWithRowMapper() {
		// Line 1
		String sql = "SELECT * FROM Book1";
		// Line 2
		List<Book> BookList = this.getJdbcTemplate().query(sql,
				new RowMappers());
		// Line 3
		for (Book b : BookList) {

			System.out.println(b.getId() + "\t"
					+ b.getBookname() + "\t"
					+ b.getBookprice());
					
		}
	}

	public void queryWithWhereClause(int id) {
	
		String sql = "SELECT * FROM Book1 where id = ?";
	
		List<Book> BookList = this.getJdbcTemplate().query(sql,
				new Object[] { new Integer(id) }, new RowMappers());
	
		
		for (Book b : BookList) {

			System.out.println(b.getId() + "\t"
					+ b.getBookname() + "\t"
					+ b.getBookprice()+"\t");
					
		}
	}
	
	public void queryForObject(int id) {
		
		String sql = "SELECT bookname FROM book1 where id = ?";
		
		String bookname = this.getJdbcTemplate().queryForObject(sql,new Object[]{new Integer(id)} ,String.class);
	
		System.out.println("bookname"+bookname);
	}
	
	public void insert(int id,String bname,int price) {
	
		BasicDataSource bd= ((BasicDataSource)this.getJdbcTemplate().getDataSource());
				bd.setDefaultAutoCommit(false);
		String sql = "insert into Book1(id,bookname,bookprice) values(?,?,?)";
	
		int count = this.getJdbcTemplate().update(sql, id,bname,price);
		
		System.out.println(count + " row inserted");
	}

	public void update(String bookname,int id) {
	
		String sql = "update Book1 set bookname=? where id = ? ";
	
		int count = this.getJdbcTemplate().update(sql, bookname,new Integer(id));
	
		System.out.println( count+" row updated");
	}
	
	
	public void delete(int id) {
	
		String sql = "delete from Book1 where id = ? ";
	
		int count = this.getJdbcTemplate().update(sql,new Integer(id));
		
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


}
