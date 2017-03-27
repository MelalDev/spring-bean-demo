package com.md.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setter-bean.xml");
		BeanC beanc = context.getBean(BeanC.class);
		((ClassPathXmlApplicationContext)context).close();
	}

}
