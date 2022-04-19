package com.hemebiotech.analytics;


import java.util.TreeMap;


public class Analytic {
	/**
	 * to count occurrences of elements of file  
	 *
	 */	
	
	public static void main(String args[]) throws Exception {
		
		String filePath= "symptoms.txt";
				
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(filePath);
				
	
		TreeMap<String, Integer> map = analyticsCounter.countSymptoms();


		analyticsCounter.saveFile(map);
			    
	}
}	

