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

public interface IReadSymptom {

	// Java program to reading
	// text file to HashMap

	    final static String filePath
	        = "symptoms.txt";
	  


		public static Map<String, Integer> HashMapFromFile()
	    {
	  
	        Map<String, Integer> map
	            = new HashMap<String, Integer>();
	        BufferedReader br = null;
	  
	        try {
	  
	            // create file object
	            File file = new File(filePath);
	  
	            // create BufferedReader object from the File
	            br = new BufferedReader(new FileReader(file));
	  
	            String line = null;
	  
	            // read file line by line
	            while ((line = br.readLine()) != null) {
	  
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
