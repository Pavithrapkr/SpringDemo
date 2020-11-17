package com.example.SpringDemo.Profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ta")
@Service
public class DiProfileDemoServiceImplThree implements DiProfileDemoService {
	
	DiProfileDemoServiceImplThree(){
		System.out.println("Profile Demo Service Impl Three");
	}

	@Override
	public String display() {
		return "This is Profile Demo service Three - Tamil";
	}

}
