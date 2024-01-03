package com.manas.microservices.limitsservice.bean;

public class Limits {
	
	private int minimum;
	private int maximum;
	public Limits() {
		super();
	}
	public Limits(int min, int max) {
		super();
		this.minimum = min;
		this.maximum = max;
	}
	public int getMin() {
		return minimum;
	}
	public void setMin(int min) {
		this.minimum = min;
	}
	public int getMax() {
		return maximum;
	}
	public void setMax(int max) {
		this.maximum = max;
	}
	@Override
	public String toString() {
		return "limits [min=" + minimum + ", max=" + maximum + "]";
	}
	
	

}
