
package com.java.biggest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BiggestController {

	@RequestMapping("/biggest")
	public String getBiggestForm() {
		
		return "BiggestNumber";
	}
	
	@RequestMapping("/BiggestResult")
	public String getBiggestResult(@RequestParam("num1")int num1,
			@RequestParam("num2")int num2,
			@RequestParam("num3")int num3,
			ModelMap map) {
		
		String result=null;
		
		if(num1>num2 && num1>num3) {
			
			result=num1+ " :: num1 is biggest number";
		}
		else if(num2>num1 && num2>num3) {
			result=num2+" ::  num2 is biggest number";
			
		}
		else {
			result=num3+" :: num3 is biggest number";
		}
		
		map.addAttribute("result", result);
		
		
		
		return "BiggestNumber";
		
	}
}
