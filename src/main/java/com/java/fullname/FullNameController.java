package com.java.fullname;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FullNameController {

	
	@RequestMapping("/full")
	public String getFullName() {
		
		return "FullName";
	}
	
	@RequestMapping("/FullNameResult")
	public String getFullNameResults(@RequestParam("fname")String fname,
			@RequestParam("lname")String lname,
			ModelMap map) {
		
		map.addAttribute("fname", fname);
		map.addAttribute("lname", lname);
		
		String fullname=fname+" "+lname;
		
		map.addAttribute("fullname", fullname);
		
		return "FullName";
		
	}
}
