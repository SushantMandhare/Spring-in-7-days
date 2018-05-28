package main.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class empController {

	
	@RequestMapping(value="/regemp",method=RequestMethod.GET)
	public String regEmp(Model model)
	{
		Employee e=new Employee();
		model.addAttribute("emp",e);
		return "addEmp";/*addEmp.jsp*/
	}
}
