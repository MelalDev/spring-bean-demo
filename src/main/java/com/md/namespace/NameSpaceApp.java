package com.md.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class NameSpaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("namespace-bean.xml");
		BeanE beanE = context.getBean(BeanE.class);
		System.out.println(beanE.getAge());
		beanE.getBeanF().execute();
	}

}
