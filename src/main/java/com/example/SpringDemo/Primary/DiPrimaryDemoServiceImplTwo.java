package com.example.SpringDemo.Primary;

import org.springframework.stereotype.Service;

@Service
public class DiPrimaryDemoServiceImplTwo implements DiPrimaryDemoService {
	
	DiPrimaryDemoServiceImplTwo(){
		System.out.println("Primary Demo Service Impl Two");
	}
	
	@Override
	public String display() {
		return "This is [Primary] Demo service Two";
	}

}
