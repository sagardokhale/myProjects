package com.test.questions;

public class Child extends Parent {
	protected int l,m,n;
	public Child(){
		System.out.println("Inside childs default constructor");
	}
	Child(int l,int m,int n){
		this.l=l;
		this.m=m;
		this.n=n;
		System.out.println("Inside childs paremetrized constructor");
	}
	
	static{
		System.out.println("Inside child static 1");
	}
	
	static{
		System.out.println("Inside child static 2");
	}
	
	void printSomething(){
		System.out.println("Inside child instance method");
	} 
	
	{
		System.out.println("Inside child instance block 1");
	}
	{
		System.out.println("Inside child instance block 2");
	}
	
	static void staticPrintMethod(){
		System.out.println("Inside child static method");
	}

}
