package service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



import dao.BookDao;
import dao.BookMasterDao;
import model.Book;


public class BookService_Declarative implements BookServiceIntf {
	
	BookDao bookdao;
	BookMasterDao bookmasterdao;
	
	                                               
	@Transactional()
	public boolean addBook(final Book b)
	{
		
			   
			System.out.print("Am in transaction\n");
			bookdao.insert(b.getId(),b.getBookname(),b.getBookprice());
			System.out.println("book inserted");
			bookmasterdao.incr_count();
			System.out.println("bookmaster incremented");
			return true;
			
							
		}
	
	
	
	
	public BookDao getBookdao() {
		return bookdao;
	}




	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}




	public BookMasterDao getBookmasterdao() {
		return bookmasterdao;
	}




	public void setBookmasterdao(BookMasterDao bookmasterdao) {
		this.bookmasterdao = bookmasterdao;
	}



}
