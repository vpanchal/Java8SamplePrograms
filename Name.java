package com.java;

//Java puzzle to illustrate use 
//of hashcode() and equals() method 
import java.util.*; 
public class Name { 
	private final String first, last; 
	public Name(String first, String last) 
	{ 
		this.first = first; 
		this.last = last; 
	} 
	public boolean equals(Object o) 
	{ 
		if (!(o instanceof Name)) 
			return false; 
		Name n = (Name)o; 
		return n.first.equals(first) && n.last.equals(last); 
	} 
public int hashCode() {
return  first.hashCode() + last.hashCode();
}
	public static void main(String[] args) 
	{ 
		Set<Name> s = new HashSet<Name>(); 
		s.add(new Name("Shubham", "Juneja")); 
		System.out.println( 
			s.contains(new Name("Shubham", "Juneja"))); 
	} 
} 
