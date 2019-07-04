package com.java;

import java.io.IOException;

public class BaseClass extends ParentClass {
	
	public String getString(String str) throws IOException {
		System.out.println(str);
		return str;
	}
	public static void main(String[] args) {
		/*ParentClass bs = new BaseClass();
		//BaseClass b = new ParentClass();
		ParentClass p = new ParentClass();
		BaseClass bp = new BaseClass();
		//bs.getString("test");
		 * 
		 * 
*/	
		/*java.lang.Runnable r=()-{
			System.out.println("sf");
		}*/
		
		byte b =1;
		b+=1;
	method(null);
	/*int a,b;
	for (a=1,b=4;a<b;a++,b--) {
		System.out.println(+a);
		System.out.println(+b);
	}*/
	synchronized (args) {
		System.out.println("2");
		try {
			args.wait();
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("3");
	}
	
	}
	
	public static void method(Object obj) {
		System.out.println(obj);
	}
	
public static void method(String str) {
		System.out.println(str +"sdf");
	}
}
