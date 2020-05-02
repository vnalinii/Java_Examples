package com.heera.java;
public class ConstructorDemo1 {
	String name;
	int ID;
	ConstructorDemo1(){
		this.name="BiginnersBook.com";
		this.ID=1234;
		}
	
	public static void main(String[] args) {
		ConstructorDemo1 obj=new ConstructorDemo1();
		System.out.println(obj.name);
		System.out.println(obj.ID);
		
		}
	}