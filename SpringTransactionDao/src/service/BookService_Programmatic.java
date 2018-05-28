package service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import dao.BookDao;
import dao.BookMasterDao;
import model.Book;

public class BookService_Programmatic implements BookServiceIntf {
	
	BookDao bookdao;
	BookMasterDao bookmasterdao;
	TransactionTemplate txTemplate;
	boolean trans_status;
	
	
	public boolean addBook(final Book b)
	{
		trans_status=false;
			
		txTemplate.execute(new TransactionCallback<Void>() {
            
			public Void doInTransaction(TransactionStatus txStatus) {
				try {
					System.out.print("Am in transaction");
					bookdao.insert(b.getId(),b.getBookname(),b.getBookprice());
					System.out.println("book inserted");
					bookmasterdao.incr_count();
					System.out.println("bookmaster incremented");
					trans_status=true;
				} catch (RuntimeException e) {
					txStatus.setRollbackOnly();
					System.out.println("insert book or incr bookmaster failed so transaction rolled back");
					//throw e;
					trans_status=false;
					}
				
				return null;
			}
			
		});
		
		return trans_status;
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




	public TransactionTemplate getTxTemplate() {
		return txTemplate;
	}




	public void setTxTemplate(TransactionTemplate txTemplate) {
		this.txTemplate = txTemplate;
	}




	public boolean isTrans_status() {
		return trans_status;
	}




	public void setTrans_status(boolean trans_status) {
		this.trans_status = trans_status;
	}




	

}
