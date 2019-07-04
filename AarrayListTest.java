package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AarrayListTest {
	
	/*public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++){
			list.add("TEST" + i);
		}
		list.add(7, "Vimal");
		list.add(7, "TEST7");
		System.out.println(list.toString());
	}*/
	
	Map<String,List<Integer>> x = new TreeMap<> ();
	public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> array =
            new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<10000; i++) {
            try {
                array.add(new ArrayList<Integer>(1000000));
            } catch (OutOfMemoryError e) {
                System.out.println(i);
                break;
            }
        }
	}
}
