package cntrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import model.Emp;


@Controller
@SessionAttributes("emp")
public class EmpController {
	
	@RequestMapping(value = "/regEmp", method = RequestMethod.GET)
	public ModelAndView formEmp()
	{
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("emp",new Emp() );
		 mv.setViewName("empform");
		 
		 return mv;
	}
	
	@RequestMapping(value = "/processEmp", method = RequestMethod.POST)
	public ModelAndView procEmp(Emp emp)
	{
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("emp", emp);
		  System.out.println("emp id:"+emp.getId()+" emp name:"+emp.getName()+" empsal:"+emp.getSal());
		 
		 if(emp.getSal()>5000)
		  {
			 mv.setViewName("successemp");
		  }
		 else
		 {
			 mv.setViewName("failureemp");
		 }
		 return mv;
	}
	
	
	@RequestMapping("/empdet")
	public ModelAndView showMessage(
			@RequestParam(value = "empname", required = false, defaultValue = "Shyam") String name) {
		System.out.println("in controller request parameter"+name);
 
		String message="RequestParam example: Hi! I am Employee:-";
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.addObject("name", name);
		mv.setViewName("greetemp");
		return mv;
	}
	
	
	@RequestMapping("/empdet1/{name}")
	public ModelAndView showMessage1(@PathVariable String name) {
		System.out.println("in controller path variable"+name);
 
		String message="PathParam Example:Hi! I am Employee:-";
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.addObject("name", name);
		mv.setViewName("greetemp");
		return mv;
	}


}
