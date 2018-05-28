package main.java;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class bookController {

	@RequestMapping("/addbook")
	public ModelAndView addBook()
	{
		ModelAndView mv=new ModelAndView("addBook");/*addBook.jsp*/
		Book b=new Book();
		mv.addObject("book",b);
		return mv;
	}
	@RequestMapping(value="/savebook",method = RequestMethod.POST)
	public ModelAndView saveBook(Book book)
	{
		ModelAndView ms=new ModelAndView("success");/*success.jsp*/
		ModelAndView mf=new ModelAndView("fail");/*fail.jsp*/
		if(book.getBookPrice() < 1000)
		{
			return mf;
		}
		else
		{
			ms.addObject("bookdetail",book);
			return ms;
		}
	}
}
