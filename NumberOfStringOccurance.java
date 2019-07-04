package com.java;

public class NumberOfStringOccurance {

	//search("pa", "papaya") It should return 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberOfStringOccurance no = new NumberOfStringOccurance();
		System.out.println(no.search("pa", "papaya"));
	}
	
	public int search(String str, String word) {
		
		// split the string by spaces in a 
	    String a[] = str.split(" "); 
	  
	    // search for pattern in a 
	    int count = 0; 
	    for (int i = 0; i < a.length; i++)  
	    { 
	    // if match found increase count 
	    if (word.equals(a[i])) 
	        count++; 
	    } 
	  
	    return count; 
		
	}

	
	
}
