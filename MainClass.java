package com.java;

class First 
{ 
	public First() { System.out.println("a"); } 
	public void foo() {
		System.out.println("First.food()");
	}
} 

class Second extends First 
{ 
	public Second() { System.out.println("b"); }
	
	
	public void foo() {
		System.out.println("Second.foo()");
	}
} 

class Third extends Second 
{ 
	public Third() { System.out.println("c"); } 
	
	public void foo() {
		System.out.println("Third.foo()");
	}
} 

public class MainClass 
{ 
	public static void main(String[] args) 
	{ 
		Third c = new Third(); 
		c.foo();
	} 
} 
