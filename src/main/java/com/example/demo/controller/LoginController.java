package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
	
	@RequestMapping("/")
	public ModelAndView init(ModelAndView mv) {
		
		mv.setViewName("index");
		mv.addObject("msg", "안녕하새요");
		
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mv) {
		
		mv.setViewName("login");
		mv.addObject("msg", "안녕하새요");
		
		return mv;
	}
	
}
