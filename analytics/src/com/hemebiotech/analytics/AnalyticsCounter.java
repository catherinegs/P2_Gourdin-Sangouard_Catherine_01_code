package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.ReadSymptomDataFromFile;

public class AnalyticsCounter {
	
    public static void countFrequencies(ArrayList<String> result)
    {
  
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        for (String t : result) {
            Integer c = tmap.get(t);
            
            tmap.put(t, (c == null) ? 1 : c + 1);
        }
  
        for (Map.Entry m : tmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
               
        
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

