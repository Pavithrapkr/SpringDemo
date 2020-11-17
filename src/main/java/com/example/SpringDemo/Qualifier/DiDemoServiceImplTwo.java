package com.example.SpringDemo.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class DiDemoServiceImplTwo implements DiQualifierDemoService {

	@Override
	public String display() {
		return "This is Demo service Two";
	}

}
