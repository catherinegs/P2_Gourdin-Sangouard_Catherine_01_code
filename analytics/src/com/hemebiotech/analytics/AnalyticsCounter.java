package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

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



