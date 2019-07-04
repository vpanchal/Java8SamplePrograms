package com.java;

import java.util.Arrays;

public class SubClass extends SuperClass {

	private static int index = 10;
	
	static void display(String str, int i) {
		System.out.println("SubClass.display()" + i);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass sc = new SubClass();
		SuperClass sc1 = new SuperClass();
		SuperClass sc2  = new SubClass();
		
		sc.display("test1",sc.index);
		//scc.display("test1",scc.index);
		sc1.display("test1",sc1.index);
		sc2.display("test1",sc2.index);
		
		char[] chars = new char[] {'\u0097'};
		String str = new String(chars);
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes));
				
	}

}
