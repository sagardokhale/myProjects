package com.test.questions;

import java.util.stream.IntStream;

public class StringCombination {

	Integer m=89;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sachin";
		
		
		
		for(int i=0;i<str.length();i++) {
			String sbstr=str.substring(1, str.length()).concat(""+str.charAt(0));
			str=sbstr;
			System.out.println(sbstr);
		}
		
		

	}
	
	public static void doSomething(StringCombination s) {
		s.m=90;
	}
	
	public static void doSomething(Integer s) {
		s=100;
	}
	
	

}
