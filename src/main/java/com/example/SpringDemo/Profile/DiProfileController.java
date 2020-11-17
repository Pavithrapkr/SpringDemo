package com.example.SpringDemo.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiProfileController {
	
	
	@Autowired
	private DiProfileDemoService diProfileDemoService;
	
	@RequestMapping("/profile")
	@ResponseBody
	String displayQualifier() {
		return diProfileDemoService.display();		
	}
}
