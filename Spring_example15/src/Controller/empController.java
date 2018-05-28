package Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import Model.Employee;

@Controller
//@SessionAttributes("emp") /*for single session varible */
@SessionAttributes({"emp","emparr"})/*for Multiple session variable*/
public class empController {

	ArrayList<Employee> arr;
	@RequestMapping(value="/regemp",method=RequestMethod.GET)
	public String regEmp(Model model)
	{
		model.addAttribute("emp",new Employee());
		return "addEmp";
	}
	@RequestMapping(value="/saveemp",method=RequestMethod.POST)
	public String saveEmp(Model model,Employee e)
	{
		if(arr != null)
		{
			arr.add(e);
		}
		else
		{
			arr=new ArrayList<Employee>();
			arr.add(e);
		}
		model.addAttribute("emp",e);
		if(e.getSalary() > 10000)
		{	
			model.addAttribute("emparr",arr);
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	@RequestMapping(value="/detemp",method=RequestMethod.GET)
	public ModelAndView detemp(@RequestParam(value="empname")String ename)
	{
		ModelAndView mv=new ModelAndView("greetemp");
		mv.addObject("message","Request param I am employee");
		mv.addObject("name",ename);
		return mv;
	}
	@RequestMapping(value="/detemp/{empname}",method=RequestMethod.GET)
	public ModelAndView detemppath(@PathVariable(value="empname")String ename)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","Path param I am employee");
		mv.addObject("name",ename);
		mv.setViewName("greetemp");
		return mv;
	}
}
