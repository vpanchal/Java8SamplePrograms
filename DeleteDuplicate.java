/**
 * 
 */
package com.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vimal Panchal
 *
 */
public class DeleteDuplicate {

	/**
	 * @param
	 * Write a function that returns a string after deleting the duplicate characters from the Sring
	 * deleteDuplicates("excessive")should return "xciv"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeleteDuplicate dd = new DeleteDuplicate();
		System.out.println(dd.deleteDuplicates("excessive"));
		dd.deleteDuplicates("progress");
		System.out.println("DeleteDuplicate.main()" + unique("progress"));

	}
	
	public String deleteDuplicates(String str){
		//excessive //xciv
		
		List<String> strList = new ArrayList<String>();
		
		for(int i=0;i<str.length();i++) {
			
			String strTtemp = str.charAt(i) + "";
			System.out.println(strTtemp);
			if(!strList.contains(strTtemp)){
				strList.add(strTtemp);
			}else {
				strList.remove(strTtemp);
			}
			
		}
		
		System.out.println("DeleteDuplicate.deleteDuplicates() " + strList.toString());
		return strList.toString();
		
	}
	
	public static String unique(String s) 
    { 
        String str = new String(); 
        int len = s.length(); 
          
        // loop to traverse the string and 
        // check for repeating chars using 
        // IndexOf() method in Java 
        for (int i = 0; i < len; i++)  
        { 
            // character at i'th index of s 
            char c = s.charAt(i); 
              
            // if c is present in str, it returns 
            // the index of c, else it returns -1 
            if (str.indexOf(c) < 0) 
            { 
                // adding c to str if -1 is returned 
                str += c; 
            } 
        } 
          
        return str; 
    } 

}
