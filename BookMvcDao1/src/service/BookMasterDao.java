package service;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class BookMasterDao extends JdbcDaoSupport{

	

	public void total_books_in_library() {
		
		String sql = "SELECT bookct FROM bookmaster where id =1 ?";
		
		int bookcount = this.getJdbcTemplate().queryForObject(sql,new Object[]{new Integer(1)} ,Integer.class);
	
		System.out.println("Total no of books in library :"+bookcount);
	}
	
	public void insert(int id,int bookcount) {
	
		String sql = "insert into bookmaster(id,bookct) values(?,?)";
	
		int count = this.getJdbcTemplate().update(sql, id, bookcount);
		
		System.out.println(count + " row inserted");
	}

	public void incr_count() {
		
         String sql = "SELECT bookct FROM bookmaster where id = ?";
		
		int bookcount = this.getJdbcTemplate().queryForObject(sql,new Object[]{new Integer(1)} ,Integer.class);
	    
		bookcount=bookcount+1;
		
		 sql = "update bookmaster set bookct=? where id = ? ";
	
		int count = this.getJdbcTemplate().update(sql, bookcount,new Integer(1));
	
		System.out.println( count+" row updated");
	}
	
	
}
