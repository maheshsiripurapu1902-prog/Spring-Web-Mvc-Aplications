package com.java.Even;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EvenController {
	
	@RequestMapping("/even")
	public String getEven() {
		
		return "Even";
	}
	
	@RequestMapping("/EvenResult")
	public String getEvenResult(@RequestParam("num1")int num1,ModelMap map) {
		
		String result=null;
		map.addAttribute("num1", num1);
		
		if(num1%2==0) {
			result=num1+ " :: num1 is even number";
		}
		else {
			result=num1+"  :: num1 is odd number";
		}
		
		
		map.addAttribute("result", result);
		return "Even";
		
	}

}
