package com.merin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	
	@RequestMapping("/courses")
	/*public String courses(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		String cname=req.getParameter("cname");
		System.out.println("welcome");
		session.setAttribute("cname", cname);
		return "course";
	}
*/
	
	/*public String courses(String cname,HttpSession session)
	{
		session.setAttribute("cname",cname);
		return "course";
	}*/
	public ModelAndView courses(@RequestParam("cname")String coursename,HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course");
		return mv;
		
	}
}
