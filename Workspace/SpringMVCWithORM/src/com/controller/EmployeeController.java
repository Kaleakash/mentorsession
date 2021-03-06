package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired					// pull the object from a container. 
	EmployeeService employeeService;	
	
	@RequestMapping(value = "hello")
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		System.out.println("I Came Here");
		
		/*
		 * 
		 * 
		 * 
		 * logic or coding 
		 * 
		 */
		return mav;
	}
	
	@RequestMapping(value = "storeEmployee",method = RequestMethod.POST)
	public ModelAndView storeEmployee(HttpServletRequest req,Employee emp) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		float salary = Float.parseFloat(req.getParameter("salary"));
		String desg = req.getParameter("desg");
		
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesg(desg);
		
		String str = employeeService.storeEmployeeDetails(emp);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", str);	
		mav.setViewName("index.jsp");
		
				// request.setAttribute("key","value");
		return mav;
	}
	
}
