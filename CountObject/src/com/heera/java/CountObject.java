package com.heera.java;
public class CountObject {
static int i;

	public CountObject() 
	{
		i++;
	}

	public static void main(String[] args) {
		// Creating new objects
		
		CountObject obj1=new CountObject();
		CountObject obj2=new CountObject();
		CountObject obj3=new CountObject();
		
		System.out.println("Number of Objects:"+i);
	}

}
