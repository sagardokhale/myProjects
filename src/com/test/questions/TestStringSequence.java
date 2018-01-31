package com.test.questions;

import java.util.Arrays;

public class TestStringSequence {
	
	
	public static char[] swapChars(char[] arr) {
		char swapA[]=new char[arr.length];
		swapA=Arrays.copyOf(arr, arr.length);
		for(int i=0;i<arr.length-2;i++) {
			char temp=swapA[i];
			swapA[i]=swapA[i+2];
			swapA[i+2]=temp;
		}
		
		return swapA;
	}
	
	public static String[] solution(String a[],String b[]) {
		int index=0;
		String [] result=new String[a.length];
		if(a.length!=b.length) {
			result[index]="Not Applicable";
			return result;
		}else {
		
			for (int i = 0; i < a.length; i++) {
				String elementA = a[i];
				String elementB = b[i];
				String aReverse = new StringBuffer(elementA).reverse().toString();
				String bReverse = new StringBuffer(elementB).reverse().toString();
				char[] allElementA = elementA.toCharArray();
				char[] allElementB = elementB.toCharArray();
				if (elementA.contentEquals(bReverse) || elementB.contentEquals(aReverse)|| elementA.contentEquals(elementB)) 
				{
					result[index] = "YES";
					index++;
				}
				else 
				{
					char [] swapA=swapChars(allElementA);
					char [] swapB=swapChars(allElementB);
					
					if(Arrays.equals(allElementA, swapB)||Arrays.equals(swapA,allElementB)) {
						result[index] = "YES";
						index++;
					}else {
						result[index] = "NO";
						index++;
					}
					
				}
				

			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] a={"abcd","abcd","abcd","cdab","abcd"};
		String[] b={"cdab","abcd","dcba","abcd","cbad"};
		
		String [] result=solution(a,b);
		for(String s:result) {
			System.out.println(s);
			
		}
	}
}
