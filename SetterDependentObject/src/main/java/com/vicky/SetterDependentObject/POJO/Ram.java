package com.vicky.SetterDependentObject.POJO;

public class Ram {
	
	private String name;
	private String size;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", size=" + size + "]";
	}
	
	

}
