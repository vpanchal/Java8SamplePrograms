package com.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


public class LinkedListTest {
	
	private Node head;
	private int listCount;
	public static LinkedListTest linkedListTest;
	
	public LinkedListTest() {
	
		head = new Node(null);
		
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linkedListTest=new LinkedListTest();
		//linkedListTest.head;
		
		LinkedList<String> list = new LinkedList<String>();
		Set<String> set = new HashSet<String>();
		set.add("Vimal");
		Map<String,String> map = new HashMap<String,String>();
		String str = new String("Key");
		String str1 = new String("Key");
		
		map.put("Key", "value");
		map.put(str, "val");
		map.put(str1, "val2");
		
		System.out.println(map.get("Key"));
		
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		list.add("Vimal");
		
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	

}
