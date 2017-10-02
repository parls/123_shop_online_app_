package net.parls.OnlineShoppingFrontEnd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class PageController {
	
	@RequestMapping(value = {"/" , "home" , "/index"})
	
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Hello...");
		return mv;
	}
	
}
