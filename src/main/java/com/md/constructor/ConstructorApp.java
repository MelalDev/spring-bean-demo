package com.md.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-bean.xml");
		BeanA beanA =context.getBean(BeanA.class);
		((ClassPathXmlApplicationContext)context).close();
	}

}
