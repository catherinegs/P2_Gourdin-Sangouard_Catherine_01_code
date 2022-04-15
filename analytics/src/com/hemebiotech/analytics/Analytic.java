package com.hemebiotech.analytics;


import java.util.List;


public class Analytic {
	/**
	 * to count occurrences of elements of file  
	 *
	 */	
	
	public static void main(String args[]) throws Exception {
		
		String filepath= "symptoms.txt";
		
		ReadSymptomDataFromFile symptomFile = new ReadSymptomDataFromFile(filepath);
		
		List<String> names = symptomFile.getSymptoms();
		
		AnalyticsCounter nameList = new AnalyticsCounter();
		
		nameList.countSymptoms(names);
			    
	 }	

}

