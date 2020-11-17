package com.example.SpringDemo.Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DiPrimaryDemoServiceImplThree implements DiPrimaryDemoService {
	
	DiPrimaryDemoServiceImplThree(){
		System.out.println("Primary Demo Service Impl Three");
	}

	@Override
	public String display() {
		return "This is [Primary] Demo service Three";
	}

}
