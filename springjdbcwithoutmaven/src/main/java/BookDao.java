package main.java;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDao {
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
		jdbcTemplate.execute("create table Book(id integer,bookName varchar(30),price integer)");
	}
	public int totalRows()
	{
		return jdbcTemplate.queryForInt("select count(*) from Book");
	}
	public void insert(int id,String name,int price)
	{
		String query="insert into Book values(?,?,?)";
		int count=jdbcTemplate.update(query,id,name,price) ;
		System.out.println(count+" rows inserted");
	}
	public void update(String name,int id)
	{
		String query="update table Book set bookName=? where id=?";
		int count=jdbcTemplate.update(query,name,id) ;
		System.out.println(count+" rows updated");
	}
	public void delete(int id)
	{
		String query="delete from Book where id=?";
		int count=jdbcTemplate.update(query,id) ;
		System.out.println(count+" rows deleted");
	}
	public void selectAll()
	{
		String query="select * from Book";
		java.util.List<Book> objectList = jdbcTemplate.query(query,
				new RowMappers());
		System.out.println("------------Table DATA START-------------");
		for (Book b : objectList) {
			System.out.println(b.getId() + "\t"
					+ b.getBookName() + "\t"
					+ b.getPrice() );
		}
		System.out.println("------------Table DATA END-------------");
	}
	class RowMappers implements RowMapper<Book> {
		public Book mapRow(ResultSet rs, int rowNumber)
				throws SQLException {
			Book b = new Book();
			b.setId(rs.getInt(1));
			b.setBookName(rs.getString(2));
			b.setPrice(Integer.parseInt(rs.getString(3)));
			return b;
		}
	}
}
