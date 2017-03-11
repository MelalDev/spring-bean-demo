package com.md.setter;

import com.md.constructor.BeanA;

public class BeanC {
	private int age;
	private BeanA beanA;
	
	public void setBeanA(BeanA beanA) {
		System.out.println("in the setBeanA setter");
		this.beanA = beanA;
	}

	public void setAge(int age) {
		System.out.println("in the setAge setter");
		this.age = age;
	}
}
