package com.java;

import java.util.WeakHashMap;

public class JavaTrickyPrograms {
	public static void main() {
        System.out.print("A");
   }
    public static void main(String args) {
        System.out.print("B");
    }
    
    
    
    static int a = 1111;
    static
    {
           a = a-- - --a;
    }
       
   {
           a = a++ + ++a;
    }
   
  
	public static void main(String[] args) {
		//System.out.println(a);
		
		//int a = 010;
	    //System.out.println(a);

		 Integer i1 = 128;
		   
		   Integer i2 = 128;
		 
		     System.out.println(i1 == i2);
		 
		   Integer i3 = 127;
		   Integer i4 = 127;
		 
		      System.out.println(i3 == i4);
		    
		
		System.out.println(args.length + " sdfa");
		// TODO Auto-generated method stub
		
		JavaTrickyPrograms jObj = new JavaTrickyPrograms();
		jObj.display(null);
		String s1= "Vimal";
		String s2= "Vimal";
		
		if(s1==s2) {
			System.out.println("JavaTrickyPrograms.main()");
		}
		
		String str = "Test";
		String result = null;
		WeakHashMap<String,String> weakMap = new WeakHashMap<String,String>(10);
		
		
		if(weakMap.get(str) == null) {
			weakMap.put(str,str);
		}
		result = weakMap.get(str);
		
		if(!weakMap.isEmpty() && weakMap.containsKey(str)){
			result = weakMap.get(str);
		 }else{
			 weakMap.put(str,str);
			 result = weakMap.get(str);
		 }
		
	}
	
	private String display(String str){
		try{
			if(str != null){
				System.out.println(str);
			}
			else{
				str = "else_Block";
				System.out.println(str);
			}
			return str;
		}catch (Exception e) {
			e.printStackTrace();	
		}finally {
			System.out.println("Finally Block");
		}
		return str;
	}

}
