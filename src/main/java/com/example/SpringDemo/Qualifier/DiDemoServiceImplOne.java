package com.example.SpringDemo.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class DiDemoServiceImplOne implements DiQualifierDemoService {

	@Override
	public String display() {
		return "This is Demo service One";
	}

}
