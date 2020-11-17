package com.example.SpringDemo.BeanLifeCycle;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Controller;

@Controller
public class CustomBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		if(bean instanceof SpringBeanLifeCycleDemo) {
			((SpringBeanLifeCycleDemo) bean).beforeInit();
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		if(bean instanceof SpringBeanLifeCycleDemo) {
			((SpringBeanLifeCycleDemo) bean).afterinit();
		}
		return bean;
	}
}
