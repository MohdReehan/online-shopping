package com.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pagecontroller {
	@RequestMapping (value= {"/","/home","/index"})
   
	public ModelAndView index()
	{
		ModelAndView ob=new ModelAndView("Page");
		ob.addObject("hello","this is the frontend");
		return ob;
	}
	
}
