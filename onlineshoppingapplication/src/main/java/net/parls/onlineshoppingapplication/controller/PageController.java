package net.parls.onlineshoppingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.parls.shoppingbackend.dao.CategoryDao;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping(value = {"/" , "/home" , "/index"})
	
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		mv.addObject("categories",categoryDao.list());
		return mv;
	}
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	@RequestMapping(value = {"/shop"})
	public ModelAndView shop() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Shop");
		mv.addObject("userClickShop",true);
		return mv;
	}

	/*@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		
		if(greeting==null) {
			greeting = "Hello";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}
	*/
}
