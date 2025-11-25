package com.java.SmallestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SmallestController {
	
	
	@RequestMapping("/small")
	public String getSmallestForm() {
		
		return "SmallNumber";
	}
	
	
	@RequestMapping("/SmallestNumber")
	public String getResultForm(@RequestParam("num1")int num1,
			@RequestParam("num2") int num2,
			@RequestParam("num3")int num3,
			ModelMap map) {
		
		
		map.addAttribute("num1", num1);
		map.addAttribute("num2", num2);
		map.addAttribute("num3", num3);
		
		String result=null;
		
		if(num1<num2 && num1<num3) {
			result=num1+"  num1 is a smallest Number";
			
		}
		else if(num2 <num3 && num2<num1) {
			result=num2+"num2 is a smallest number";
		}
		else {
			result=num3+" num3 is a smallest number";
		}
		
		
		map.addAttribute("result", result);
		
		
		
		return "SmallNumber";
		
	}

}
