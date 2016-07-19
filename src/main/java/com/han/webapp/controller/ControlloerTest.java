package com.han.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlloerTest {
	
	@RequestMapping("/formData")
	public String formData(@RequestParam("name") String name,@RequestParam("num") int num,@RequestParam("tel") String tel, Model model){
		
		//String name = req.getParameter("name");
		//String num = req.getParameter("num");
		//String tel = req.getParameter("tel");
		
		model.addAttribute("name", name);
		model.addAttribute("num",num);
		model.addAttribute("tel", tel);
		return "formView";
	}
	
	@RequestMapping(value="/aLink", method=RequestMethod.GET)
	public String aLinkTest(HttpServletRequest req,Model model){
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		return "aLink";
	}
	@RequestMapping("/view1")
	public String view(Model model){
		model.addAttribute("name","ȫ�浿");
		model.addAttribute("tel","010-1234-4252");
		return "view1";
	}
	
/*	@RequestMapping("/formData")
	public String formData(HttpServletRequest req, Model model){
		
		String name = req.getParameter("name");
		String num = req.getParameter("num");
		String tel = req.getParameter("tel");
		
		model.addAttribute("name", name);
		model.addAttribute("num",num);
		model.addAttribute("tel", tel);
		return "formView";
	}*/
}
