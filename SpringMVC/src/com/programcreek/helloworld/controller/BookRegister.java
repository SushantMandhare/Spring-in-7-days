package com.programcreek.helloworld.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;


@Controller

public class BookRegister {

	
	//@RequestMapping(value = "/AddBook", method = RequestMethod.GET)
	@RequestMapping(value = "/AddBook/{name}", method = RequestMethod.GET)
	public String displayForm(Model model,HttpServletRequest request,@PathVariable String name) {
			
		System.out.println(name);
		model.addAttribute("brandname",name);
		model.addAttribute("book",new Book());
		
	return "addBook";
	}
	
	
	@RequestMapping(value = "/ProcessBook")
	public String processForm(@Valid Book book, BindingResult bindingResult,Model model) {
		System.out.println("in process user");
		System.out.println(bindingResult.hasErrors());
		System.out.println(book.getBookname() + "   " + book.getBookid());
		model.addAttribute("book",book);
		  if(book.getBookprice()<1000)
		  {
			
			  
			return "successbook";
		  }
		  else
		  {
			  return "failurebook";
		  }
		
	}
}
