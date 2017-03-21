package com.md.autowiring;

public class ObjectC {
	private ObjectB objectB;
	private ObjectA objectA;

	public ObjectC(ObjectB objectB, ObjectA objectA) {
		super();
		this.objectB = objectB;
		this.objectA = objectA;
		System.out.println("in ObjectC constructor 	=> ObjectC(ObjectB objectB, ObjectA objectA) " );
	}

	public ObjectC(ObjectB objectB) {
		super();
		this.objectB = objectB;
		System.out.println("in ObjectC constructor 	=> ObjectC(ObjectB objectB) " );
		
	}
}
