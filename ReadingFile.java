package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ReadingFile {
	public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "input.txt";
        
        // This will reference one line at a time
        String line = null;

        try {
        	//This is used to check the current directory file.
            File f = new File(fileName);
            // FileReader reads text files in the default encoding.
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(new FileReader(f));

            Map<String,Integer> mapObje = new HashMap<String,Integer>();
            Map<String, List<String>> mapObject = new HashMap<>();
            
            while((line = bufferedReader.readLine()) != null) {
               String[] strArray = line.split(",");
               if(mapObje.containsKey(strArray[2])) {
            	   mapObje.put(strArray[2], mapObje.get(strArray[2]) +1);
            	   List<String> strList = mapObject.get(strArray[2]);
            	   strList.add(line);
            	   mapObject.put(strArray[2], strList);
            	   strList = null;
               }else {
            	   mapObje.put(strArray[2],1);
            	   List<String> strList = new ArrayList<>();
            	   strList.add(line);
            	   mapObject.put(strArray[2], strList);
            	   strList = null;
               }
               
            }
            // Always close files.
            bufferedReader.close();      
            
            List<String> listOfServerName = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : mapObje.entrySet()) {
            	if(entry.getValue() > 2) {
            		List<String> strList = mapObject.get(entry.getKey());
            		listOfServerName.add(getServerName(strList));
            	}
            }
            
            //Write File
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter("output.txt");

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            for(String str:listOfServerName) {
            	 bufferedWriter.write(str);
            }
            // Always close files.
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
	
	/**
	 * Gets the server name.
	 *
	 * @param strList the str list
	 * @return the server name
	 */
	private static String getServerName(List<String> strList) {
		
		List<String> listOfServerName = new ArrayList<String>();
        List<String> listOfSoftwareNames = new ArrayList<String>();
        List<Double> listOfSoftwareVersions = new ArrayList<Double>();
		
		for (Iterator iterator = strList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			String[] strArray = string.split(",");
			listOfServerName.add(strArray[0].trim());
            listOfSoftwareNames.add(strArray[2].trim());
            listOfSoftwareVersions.add(Double.valueOf(strArray[3].trim().substring(0, 2)));
		}
        int minIndex = listOfSoftwareVersions.indexOf(Collections.min(listOfSoftwareVersions));
        System.out.println(minIndex + " Server Name :: " + listOfSoftwareNames.get(minIndex));
		return listOfSoftwareNames.get(minIndex);
	}
}
;