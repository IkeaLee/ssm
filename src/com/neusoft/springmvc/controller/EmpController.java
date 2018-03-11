package com.neusoft.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.springmvc.bean.Emp;

@Controller
@RequestMapping("/emp")
public class EmpController {
	Logger log = LoggerFactory.getLogger(EmpController.class);
	
	@RequestMapping("/index")
	public void index(HttpServletResponse response) throws IOException {
		response.sendRedirect("list");
	}
	
	@RequestMapping("/execadd")
	public ModelAndView add(Emp e) {
		log.info(e.toString());
		ModelAndView mav = new ModelAndView();
		mav.addObject("emp", e);
		mav.setViewName("emp/show");
		return mav;
	}
	
	@RequestMapping("/add")
	public String help(Integer age) {

		return "emp/add";
	}
	
	@RequestMapping("/list")
	public String list() {
		return "index";
	}
}
