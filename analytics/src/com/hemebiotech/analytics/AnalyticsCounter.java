package com.hemebiotech.analytics;


import java.util.List;


public class AnalyticsCounter {
	/**
	 * to count occurrences of elements of ArrayList 
	 *
	 */	
	
	public static void main(String args[]) throws Exception {
		
		String filepath= "symptoms.txt";
		
		ReadSymptomDataFromFile symptomFile = new ReadSymptomDataFromFile(filepath);
		
		List<String> names = symptomFile.GetSymptoms();
		
		symptomFile.countSymptoms(names);
			    
	 }	

}



