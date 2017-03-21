package com.md.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("auto-bean.xml");
		ObjectA objectA = context.getBean("objectA",ObjectA.class);
		
		ObjectC objectC = context.getBean("objectC",ObjectC.class);

	}

}
