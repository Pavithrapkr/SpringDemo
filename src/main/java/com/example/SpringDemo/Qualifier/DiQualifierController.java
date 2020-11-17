package com.example.SpringDemo.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DiQualifierController {
	
	@Autowired
	@Qualifier("diDemoServiceImplOne")
	private DiQualifierDemoService diDemoServiceImpl;
	
	@Autowired
	@Qualifier("diDemoServiceImplThree")
	private DiQualifierDemoService diDemoServiceImplThree;
	
	@RequestMapping("/beanName")
	@ResponseBody
	String display() {
		return diDemoServiceImplThree.display();		
	}
	
	@RequestMapping("/qualifier")
	@ResponseBody
	String displayQualifier() {
		return diDemoServiceImpl.display();		
	}
}
