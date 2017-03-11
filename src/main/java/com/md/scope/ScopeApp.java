package com.md.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("scope-bean.xml");
		Prototype proto1 = context.getBean(Prototype.class);
		Prototype proto2 = context.getBean(Prototype.class);
		
		System.out.println(proto1==proto2);
	}

}
