package com.example.SpringDemo.Profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("en")
@Service
public class DiProfileDemoServiceImplOne implements DiProfileDemoService {
	
	DiProfileDemoServiceImplOne(){
		System.out.println("Profile Demo Service Impl One");
	}

	@Override
	public String display() {
		return "This is Profile Demo service One - English";
	}

}
