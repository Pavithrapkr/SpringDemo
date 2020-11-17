package com.example.SpringDemo.Primary;

import org.springframework.stereotype.Service;

@Service
public class DiPrimaryDemoServiceImplOne implements DiPrimaryDemoService {

	DiPrimaryDemoServiceImplOne(){
		System.out.println("Primary Demo Service Impl One");
	}
	
	@Override
	public String display() {
		return "This is [Primary] Demo service One";
	}

}
