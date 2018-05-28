package model;


public class Book {

	private int id;
	private String bookname;
	private Integer bookprice;
	
	public Book()
	{
		
	}
	
	public Book(int id,String name,int price)
	{
		this.id=id;
		this.bookname=name;
		this.bookprice=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Integer getBookprice() {
		return bookprice;
	}
	public void setBookprice(Integer bookprice) {
		this.bookprice = bookprice;
	}

	

}


