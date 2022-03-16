package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.hemebiotech.analytics.Symptoms; 

public class ReadSymptom {
	// Java program to reading
	// text file to HashMap

	    final static String filePath
	        = "symptoms.txt";
	    
	    
		public static void iterateUsingEntrySet(Map<Integer, Symptoms> map) throws IOException {
			

	        // iterate over HashMap entries
	        for (Map.Entry<Integer, Symptoms> entry :
	             map.entrySet()) {
	            System.out.println(entry.getKey() + " : "
	                               + entry.getValue());
	        }
	    }
			
			public static Map<Integer, Symptoms> HashMapFromFile() throws IOException
		    {

	        Map<Integer, Symptoms> map
	            = new HashMap<Integer, Symptoms>();
	        BufferedReader br = null;
	  
	        try {
	  
	            // create file object
	            File file = new File(filePath);
	  
	            // create BufferedReader object from the File
	            br = new BufferedReader(new FileReader(file));
	  
	            // read file line by line
	            while ((br.readLine()) != null) {

	                String line = null;
					// split the line by :
	                String[] parts = line.split(":");
	                
           }
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        finally {
	  
	            // Always close the BufferedReader
	            if (br != null) {
	                try {
	                    br.close();
	                }
	                catch (Exception e) {
	                };
	            }
	        }
	  
	        return map;
 
	}
		}
		


