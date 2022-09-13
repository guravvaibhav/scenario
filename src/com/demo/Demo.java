package com.demo;


public class Demo  {
	
	public static void main(String[] args) {
		String s="AB";
		String s1=s.concat("C");
		 s1=s1.concat("C");
		 s1.concat(s);
		 String s2=s1.concat("D");
		
		
		System.out.println(s2);
	}
}
