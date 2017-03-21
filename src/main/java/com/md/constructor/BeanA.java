package com.md.constructor;

public class BeanA {
	
	BeanB beanB;

	public BeanA() {
		System.out.println("BeanA default constructor");
	}
	public BeanA(BeanB beanB) {
		System.out.println("BeanA constructor with BeanB parameter");
	}
	
	
	public void test1(){
		
	}
	
	
}
