package com.vicky.DIDependentObject.POJO;

public class Brand {
	
	private String name;
	private String model;
	public Brand(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", model=" + model + "]";
	}
	
	
	

}
