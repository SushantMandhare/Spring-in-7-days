package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.*;

@Controller
public class LoginFormController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String onSubmit(@RequestParam("username") String username,
			@RequestParam("password") String password, Model model,HttpServletRequest request) {
		
		
		
		model.addAttribute("username", username);
		
		System.out.println("username:"+username+"    password:"+password);
		
		if (username.equals("namrata") && password.equals("marathe123"))
			return "success1";
		else
			return "failure";

	}
}
