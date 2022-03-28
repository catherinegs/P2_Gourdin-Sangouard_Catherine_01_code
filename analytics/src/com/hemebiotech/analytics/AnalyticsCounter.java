package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
    public static void countFrequencies(ArrayList<String> result) throws IOException
    {
        // Save original out stream.
        PrintStream originalOut = System.out;

        // Create a new file output stream.
        PrintStream fileOut = new PrintStream("resultcorrect.out");
        
        // Redirect standard out to file.
        System.setOut(fileOut);

        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        
        for (String t : result) {
            Integer c = tmap.get(t);
            
            tmap.put(t, (c == null) ? 1 : c + 1);
        }

        for (Map.Entry m : tmap.entrySet())
            // If user input a valid email then write the email to ./out.txt and console.
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
        for (Map.Entry m : tmap.entrySet())
        originalOut.println("Frequency of " + m.getKey() + " is " + m.getValue());

        // Do not forget set original output and error stream back again.
        System.setOut(originalOut);        
    }  		
	
	public static void main(String args[]) throws Exception {
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
			String line = reader.readLine();
			
			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		countFrequencies(result);

		}	
	}

