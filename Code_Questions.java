package com.java;

import java.util.HashSet;

public class Code_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc"; String s2 = "abc"; System.out.println("s1 == s2 is:" + s1 == s2);
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
		
		
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
		shortSet.add(i);
		shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
		
		
		String str = null; 
		String str1="abc"; 
		System.out.println(str1.equals("abc") | str.equals(null));
	}

}
