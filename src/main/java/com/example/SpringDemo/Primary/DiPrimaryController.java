package com.example.SpringDemo.Primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiPrimaryController {
	
	@Autowired
	private DiPrimaryDemoService diDemoServiceImpl;
	
	@RequestMapping("/primary")
	@ResponseBody
	String displayQualifier() {
		return diDemoServiceImpl.display();		
	}
}
