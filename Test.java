package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Test implements Runnable 
{ 
	public void run() 
	{ 
		System.out.printf("%d",3); 
	} 
	
	enum Name{
		Alice, Smith,Bob,Jones
	}
	public  static void main(String[] args) throws InterruptedException 
	{ 
		Thread thread = new Thread(new Test()); 
		thread.start(); 
		//System.out.println("1"); 
		thread.join(); 
		//System.out.printf("%d",2); 
		
		String str = "Get Entertained";
		StringTokenizer st = new StringTokenizer(str,"t");
		while(st.hasMoreElements()) {
			System.out.print(st.nextToken());
		}
		
		int val = 0b11011;
		System.out.println(val);
		
		Set<Name> mySet = new TreeSet<Name>();
		mySet.add(Name.Alice);
		mySet.add(Name.Smith);
		mySet.add(Name.Bob);
		mySet.add(Name.Smith);
		for(Name d: mySet) {
			System.out.println(d);
		}
		
		int[] intArray = {1,0,1,0,1,0,1};
		
		List<Integer> listZero = new ArrayList<Integer>();
		List<Integer> listOfArray = new ArrayList<Integer>();
		
		for(int i = 0; i< intArray.length; i++) {
			if(intArray[i] == 1) {
				listOfArray.add(intArray[i]);
			}else {
				listZero.add(intArray[i]);
			}
		}
		listOfArray.addAll(0, listZero);
		
		listOfArray.forEach(System.out::println);
	} 

} 
