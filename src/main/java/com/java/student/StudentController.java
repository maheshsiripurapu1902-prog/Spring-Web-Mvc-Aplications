package com.java.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	
	@RequestMapping("/student")
	public String getStudentMarkListForm() {
		
		return "student";
	}
	
	
	
	@RequestMapping("/StudentResult")
	public String getStudentResult(@RequestParam("id")int id,
			@RequestParam("fname")String fname,
			@RequestParam("lname")String lname,
			@RequestParam("java")int java,
			@RequestParam("spring")int spring,
			@RequestParam("hibernate")int hibernate,
			@RequestParam("javascript")int javascript,
			ModelMap  map) {
		
		
		map.addAttribute("id", id);
		
		String fullname=fname+" "+lname;
		
		map.addAttribute("fullname", fullname);
		
		map.addAttribute("java", java);
		map.addAttribute("spring", spring);
		
		map.addAttribute("hibernate", hibernate);
		
		map.addAttribute("javascript", javascript);
		
		
		int total=java+spring+hibernate+javascript;
		
		map.addAttribute("total", total);
		
		int precentage=total/4;
		
		map.addAttribute("precentage", precentage);
		String grade=null;
		
		
		if(precentage>=90 && precentage<=100) {
			grade=" A+ Grade";
		}
		
		else if(precentage>=70 && precentage<=90) {
			grade="A grade";
		}
		
		else if(precentage>=50 && precentage<=70) {
			grade="B grade";
		}
		else {
			grade="please try again";
		}
		
		
		map.addAttribute("grade", grade);
		
		
		return "student";
	}

}
