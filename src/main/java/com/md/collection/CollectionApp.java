package com.md.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("set.bean.xml");
		Bean bean = context.getBean("bean",Bean.class);
		
		System.out.println("\nPrinting List : ");
		for (	ObjectA	token : bean.getList()) {
			System.out.println(token);
		}

		System.out.println("\nPrinting set : ");
		for (	String	token : bean.getSet()) {
			System.out.println(token);
		}

		System.out.println("\nPrinting map : ");
		for (	String	token : bean.getMap().values()) {
			System.out.println(token);
		}

		System.out.println("\nPrinting properties : ");
		for (	Object	token : bean.getProperties().keySet()) {
			System.out.println(bean.getProperties().getProperty((String)token));
		}
		((ClassPathXmlApplicationContext)context).close();
	}

}
