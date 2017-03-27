package com.md.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.constructor.BeanA;

public class FactoryApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory-bean.xml");
		BeanG beanG = context.getBean(BeanG.class);
		System.out.println(beanG.getYear());
		
		BeanA beanA = context.getBean(BeanA.class);
		((ClassPathXmlApplicationContext)context).close();
	}

}
