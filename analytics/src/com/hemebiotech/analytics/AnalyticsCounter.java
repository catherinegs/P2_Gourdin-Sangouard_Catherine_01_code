package com.hemebiotech.analytics;


import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter implements IAnalyticsCounter {
	/**
	 * to count occurrences of elements of ArrayList 
	 *
	 */	
	   @Override	
	   public void countSymptoms(List<String> result) throws IOException
	    {
	        // Save original out stream.
	        PrintStream originalOut = System.out;

	        // Create a new file output stream.
	        PrintStream fileOut = new PrintStream("result.out");
	        
	        // Redirect standard out to file.
	        System.setOut(fileOut);
	        
	        // TreeMap is created and elements of 
	        // arraylist are inserted into it
	        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
	        
	        for (String name : result) {
	            Integer frequency = tmap.get(name);
	            
	            tmap.put(name, (frequency == null) ? 1 : frequency + 1);
	        }

	        for (Map.Entry m : tmap.entrySet())
	            // send frequency of symptoms to file result.out and console.
	            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	        for (Map.Entry m : tmap.entrySet())
	        originalOut.println("Frequency of " + m.getKey() + " is " + m.getValue());

	        // Do not forget set original output and error stream back again.
	        System.setOut(originalOut);        
	    }

}



