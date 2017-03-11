package com.md.factory;

import java.util.Calendar;

public class BeanG {
	private Calendar calendar;

	public BeanG(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public BeanG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getYear(){
		return this.calendar.get(Calendar.YEAR);
	}
	
}
