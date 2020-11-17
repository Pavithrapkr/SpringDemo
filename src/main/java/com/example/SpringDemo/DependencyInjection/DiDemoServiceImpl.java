package com.example.SpringDemo.DependencyInjection;

import org.springframework.stereotype.Service;

@Service
public class DiDemoServiceImpl implements DiDemoService {

	@Override
	public String display() {
		return "This is Demo service";
	}

}
