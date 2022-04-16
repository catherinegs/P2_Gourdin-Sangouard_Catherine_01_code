package com.hemebiotech.analytics;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter {
	
	
	private String filePath;

	public AnalyticsCounter(String filePath) {
		
		this.filePath = filePath;
		// TODO Auto-generated constructor stub
	}

	/**
	 * to count occurrences of elements of ArrayList 
	 * @return 
	 *
	 */	
	   @Override	
	   public TreeMap<String, Integer>  countSymptoms() throws IOException
	    {
			ReadSymptomDataFromFile symptomFile = new ReadSymptomDataFromFile(filePath); 
			
			List<String> symptoms = symptomFile.getSymptoms();
	        // TreeMap is created and elements of 
	        // arraylist are inserted into it
	        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
	        
	        for (String name : symptoms) {
	            Integer frequency = tmap.get(name);
	            
	            tmap.put(name, (frequency == null) ? 1 : frequency + 1);
	        }
	        return tmap;
	    }
	   
	   public void saveFile(TreeMap<String, Integer> map) throws FileNotFoundException { 
	        
	        // Save original out stream.
	        PrintStream originalOut = System.out;

	        // Create a new file output stream.
	        PrintStream fileOut = new PrintStream("result.out");
	        
	        // Redirect standard out to file.
	        System.setOut(fileOut);

			for (Map.Entry m : map.entrySet())
	            // send frequency of symptoms to file result.out and console.
	            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	        for (Map.Entry m : map.entrySet())
	        originalOut.println("Frequency of " + m.getKey() + " is " + m.getValue());

	        // Do not forget set original output and error stream back again.
	        System.setOut(originalOut);        

        }
}



