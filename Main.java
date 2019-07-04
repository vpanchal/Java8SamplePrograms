package com.java;

//file name: Main.java 

class Base { 
	protected void foo() {
		System.out.println("Base.foo()");
	} 
} 
class Derived extends Base { 
	protected void foo() {
		System.out.println("Derived.foo()");
	} 
} 
public class Main { 
	public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
    /*public static void gfg(Integer i) 
    { 
        System.out.println("Integer"); 
    } */
	public static void main(String args[]) { 
		Derived d = new Derived(); 
		d.foo();
		gfg(null);
		
		String s1 = "abc"; 
        String s2 = s1; 
        s1 += "d"; 
        System.out.println(s1 + " " + s2 + " " + (s1 == s2)); 
  
        StringBuffer sb1 = new StringBuffer("abc"); 
        StringBuffer sb2 = sb1; 
        sb1.append("d"); 
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2)); 
	} 
} 
