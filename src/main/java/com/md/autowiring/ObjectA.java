package com.md.autowiring;

public class ObjectA {
	private ObjectB objectB;
	
	
	public ObjectA() {
		System.out.println("ObjectA constructor");
	}

	public ObjectB getObjectB() {
		return objectB;
	}

	public void setObjectB(ObjectB objectB) {
		System.out.println("in setObjectB(ObjectB objectB)");
		System.out.println("injected bean name : " +objectB);
		this.objectB = objectB;
	}
}
