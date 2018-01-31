package com.test.questions;

public class Parent {
	int i,j,k;
	
	Parent(){
		System.out.println("Inside parents default constructor");
	}
	
	Parent(int i,int j,int k){
		this.i=i;
		this.j=j;
		this.k=k;
		System.out.println("Inside parents paremetrized constructor");
	}
	
	static{
		System.out.println("Inside parent static 1");
	}
	
	static{
		System.out.println("Inside parent static 2");
	}
	
	

	void printSomething(){
		System.out.println("Inside parent instance method");
	} 
	
	{
		System.out.println("Inside parent instance block 1");
	}
	{
		System.out.println("Inside parent instance block 2");
	}
	
	static void staticPrintMethod(){
		System.out.println("Inside parent static method");
	}
	
	public boolean equals(Object o){
		if(this==o)
			return true;
		if((o==null)||(this.getClass()!=o.getClass()))
			return false;
		Parent p=(Parent) o;
		return (p.i==i)&&(p.j==j)&&(p.k==k);
	}
	
	public int hashCode(){
		int hash=7;
		hash=hash+hash*i*j*k;
		return hash;
	}
	

}
