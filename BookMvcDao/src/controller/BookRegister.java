package controller;

import java.util.ArrayList;

import model.Book;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


import dao.SpringJDBCDAO;

@Controller

public class BookRegister {

	@Autowired
	SpringJDBCDAO dao;
	
	@RequestMapping(value = "/AddBook", method = RequestMethod.GET)
	public String displayForm(Model model,HttpServletRequest request) {
			
		System.out.println("adding book bean to model");
		
		model.addAttribute("book",new Book());
		
	return "addBook";
	}
	
	
	@RequestMapping(value = "/ProcessBook")
	public String processForm(Book book, Model model) {
	   
		int id = book.getId();
	    String bname = book.getBookname();
	    int price = book.getBookprice();
	    
	    System.out.println(id+bname+price);
	    
		dao.insert(id, bname, price);
		model.addAttribute("book",book);
		  
			  
			return "successbook";
		 
		
	}
}
