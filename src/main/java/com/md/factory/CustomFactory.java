package com.md.factory;

import com.md.constructor.BeanA;

public class CustomFactory {

	public CustomFactory() {
		System.out.println("instantiating factory");
	}
	
	public BeanA getBeanAInstance(){
		return new BeanA();
	}
}
