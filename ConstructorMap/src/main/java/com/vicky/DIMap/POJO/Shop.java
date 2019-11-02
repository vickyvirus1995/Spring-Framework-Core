package com.vicky.DIMap.POJO;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Shop {
	
	private String name;
	private String products;
	private Map<String,Integer> laptop;
	
	
	public Shop(String name, String products, Map<String, Integer> laptop) {
		
		this.name = name;
		this.products = products;
		this.laptop = laptop;
	}


	@Override
	public String toString() {
		return "Shop [name=" + name + ", products=" + products + "]";
	}
	
	public void show()
	{
		System.out.println("Name  :  " + name);
		System.out.println("Products  :  " + products);
		Set s = laptop.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry lap = (Map.Entry)it.next();
			System.out.println("Brand : " + lap.getKey()+" Price :   "+ lap.getValue());
		}
	}
	
	

}
