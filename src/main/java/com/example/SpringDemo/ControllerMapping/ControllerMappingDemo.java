package com.example.SpringDemo.ControllerMapping;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerMappingDemo {
	
	public ControllerMappingDemo() {
		System.out.println("Controller Mapper Successfully using @Controller annotation");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method for controller demo");
	}

}
