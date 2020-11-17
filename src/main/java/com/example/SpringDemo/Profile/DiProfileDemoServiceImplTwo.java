package com.example.SpringDemo.Profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("te")
@Service
public class DiProfileDemoServiceImplTwo implements DiProfileDemoService {
	
	DiProfileDemoServiceImplTwo(){
		System.out.println("Profile Demo Service Impl Two");
	}

	@Override
	public String display() {
		return "This is Profile Demo service Two - Telugu";
	}

}
