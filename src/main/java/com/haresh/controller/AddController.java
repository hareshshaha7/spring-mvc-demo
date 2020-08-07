package com.haresh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.haresh.service.AddService;


@Controller
public class AddController
{
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView add(@RequestParam("no1") int x, @RequestParam("no2") int y) {
		AddService service = new AddService();
		int z = service.add(x, y);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", z);
		return mv;
	}
	
}
