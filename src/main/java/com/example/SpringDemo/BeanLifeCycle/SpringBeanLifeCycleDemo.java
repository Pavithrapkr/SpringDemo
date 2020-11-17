package com.example.SpringDemo.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller
public class SpringBeanLifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{
	SpringBeanLifeCycleDemo(){
		System.out.println(" * * * Life Cycle - Construtor * * * ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" * * * Life Cycle - afterPropertiesSet() from InitializingBean IF * * * ");
	}

	@Override
	public void destroy() throws Exception {	
		System.out.println(" * * * Life Cycle - destroy() from DisposableBean IF * * * ");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println(" * * * Life Cycle - setBeanName() from BeanNameAware IF* * * ");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println(" * * * Life Cycle - setBeanFactory() from BeanFactoryAware IF * * * ");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println(" * * * Life Cycle - setApplicationContext() from ApplicationContextAware IF * * * ");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println(" * * * Life Cycle - postConstruct() from @PostConstruct * * * ");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(" * * * Life Cycle - preDestroy() from @PreDestroy * * * ");
	}
	
	public void beforeInit() {
		System.out.println(" * * * Life Cycle - beforeInit() from  IF * * * ");
	}
	
	public void afterinit() {
		System.out.println(" * * * Life Cycle - afterinit() from  IF * * * ");
	}
}
