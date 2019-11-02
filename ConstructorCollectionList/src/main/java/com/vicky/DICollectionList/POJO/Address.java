package com.vicky.DICollectionList.POJO;

public class Address {
	
	private String street;
	private int pincode;
	
	public Address(String street, int pincode) {
	
		this.street = street;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "[street=" + street + ", pincode=" + pincode + "]";
	}
	
	

}
