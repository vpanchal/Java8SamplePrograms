package com.java;

class Alpha 
{ 
	public String type = "a "; 
	public Alpha() { System.out.print("alpha "); } 
} 

public class Beta extends Alpha 
{ 
	public Beta() { System.out.print("beta "); } 

	void go() 
	{ 
		type = "b "; 
		System.out.print(this.type + super.type); 
	} 

	public static void main(String[] args) 
	{ 
		new Beta().go();
		System.out.println();
		Beta b = new Beta();
		b.go();
		System.out.println();
		StringBuilder s1 = new StringBuilder("Java"); 
        String s2 = "Love"; 
        s1.append(s2); 
        System.out.println(s1);
        System.out.println(s1.substring(4)); 
        
        int foundAt = s1.indexOf(s2); 
        System.out.println(foundAt); 
	} 
} 
