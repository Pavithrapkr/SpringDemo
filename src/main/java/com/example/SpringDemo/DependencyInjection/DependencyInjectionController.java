package com.example.SpringDemo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DependencyInjectionController {
	
//	@Autowired			// Type - 1
	private final DiDemoService diDemoServiceImpl;
	
	public DependencyInjectionController(DiDemoService diDemoServiceImpl) {			// Type-2 The Good way of doing DI
		this.diDemoServiceImpl = diDemoServiceImpl;
		System.out.println("Entered in Dependency Injection Demo Controller");
	}
	
	@RequestMapping("/display")
	@ResponseBody
	String display() {
		return diDemoServiceImpl.display();		
	}
	
//	@Autowired											// Type-3
//	void setter(DiDemoService diDemoServiceImpl) {
//		this.diDemoServiceImpl = diDemoServiceImpl;
//	}
}
