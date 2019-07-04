package com.java;

import java.util.*;

import com.java.util.LinkedList; 

public class Treeset 
{ 
	public static void main(String[] args) 
	{ 
		TreeSet<String> treeSet = new TreeSet<>(); 

		treeSet.add("Geeks"); 
		treeSet.add("for"); 
		treeSet.add("Geeks"); 
		treeSet.add("GeeksforGeeks"); 
		treeSet.add("Abc");

		for (String temp : treeSet) 
			System.out.printf(temp + " "); 

		System.out.println("\n"); 
		
		List<String> list = new LinkedList<>(); 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("GeeksforGeeks"); 
        Iterator<String> iter = list.iterator(); 
  
        while (iter.hasNext()) {
            System.out.printf(iter.next().valueOf(i) + " "); 
  
        System.out.println(); 
    	}
        
        ArrayList<String> list0 = new ArrayList<String>(); 
        ArrayList<Integer> list1 = new ArrayList<Integer>(); 
        boolean check = (list0.getClass() == list1.getClass()); 
        System.out.println(check); 
        
        ArrayList<Integer> list2 = new ArrayList<Integer>(); 
        list2.add(4); 
        list2.add(7); 
        list2.add(1); 
        for (int number : list2) { 
            System.out.print(number + " "); 
        } 
	} 
} 
