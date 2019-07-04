package com.java;

//Java implementation of the approach 
import java.util.*; 
class GFG { 

	// Function to return the count of operations required 
	static int totalOperations(String str, int len) 
	{ 

		// HashMap to store characters and their frequencies 
		HashMap<Character, Integer> h = new HashMap<Character, Integer>(); 
		for (int i = 0; i < len; i++) { 

			// If already contains the character then 
			// increment its frequency by 1 
			if (h.containsKey(str.charAt(i))) 
				h.put(str.charAt(i), h.get(str.charAt(i)) + 1); 

			// Else add the character to the HashMap with frequency 1 
			else
				h.put(str.charAt(i), 1); 
		} 

		// Set to iterate over HashMap 
		Set<Map.Entry<Character, Integer> > set = h.entrySet(); 

		// HashSet to store unique frequency 
		HashSet<Integer> hs = new HashSet<Integer>(); 

		// Insert frequencies into HashSet 
		for (Map.Entry<Character, Integer> me : set) 
			hs.add(me.getValue()); 

		// Count of unique frequencies 
		return hs.size(); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "geeksforgeeks"; 
		int len = str.length(); 
		System.out.println(totalOperations(str, len)); 
	} 
} 
