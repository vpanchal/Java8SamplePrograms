package com.java;

 class Base 
{ 
	private int multiplier(int data) 
	{ 
		return data*5; 
	} 
} 

public class Derived extends Base 
{ 
	private static int data; 
	public Derived() 
	{ 
		data = 25; 
	} 
	public static void main(String[] args) 
	{ 
		Base temp = new Derived(); 
		System.out.println(temp.multiplier(data)); 
	} 
} 

