package com.heera.java;
public class JavaEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		//String s3 = s2;
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		//System.out.println(s1==s3);
		//System.out.println(s1.equals(s3));
		String s4="";
		String s5=new String();
		
	
		//System.out.println(s1);
		//System.out.println(s2);
		System.out.println("s3 is "+s3);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println("s1 == s2 is "+(s1==s2));
		System.out.println(s1.equals(s2));
		System.out.println("s2 == s3 is "+(s2==s3));
		System.out.println(s2.equals(s3));
		
		System.out.println("s4 is:"+s4);
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		

}
}
