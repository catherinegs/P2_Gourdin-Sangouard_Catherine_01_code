package com.hemebiotech.analyticsbis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.hemebiotech.analytics.projet1.Symptoms;

public class SymptomLIst {

		// TODO Auto-generated method stub
		
		// Java program to reading
		// text file to TreeMap
	private static Map<? extends String, ? extends Integer> extracted(String name, int frequency) {
		return (Map<? extends String, ? extends Integer>) new Symptoms(name, frequency);
	}

	
		public static void main(String args[]) throws NumberFormatException, IOException {
			

			
			Map<String, Integer> symptomList = new TreeMap<>();
			
			Set<Map.Entry<String, Integer>> symptoms = symptomList.entrySet();
			
	        	try {
	    		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));

	    		while ((reader.readLine())!= null) {
	        		String  line = reader.readLine();

	        	    String[] nameCol = line.split("");

	    			
	   			 String name = nameCol[1];
	   			 int frequency = Integer.valueOf(nameCol[0]);
	   			 symptomList.putAll(extracted(name, frequency));

	    	        for(Map.Entry<String,Integer> entry: symptoms) {

	                System.out.println(entry.getKey() +":" + entry.getValue());

	        }
	    		} reader.close();
	    		
	        	} catch (IOException e) {
					e.printStackTrace();
				}

	    		
	    		// next generate output
	    		FileWriter writer = new FileWriter ("resultcorrect.out");
	    		writer.write("symptome: " + symptoms);
	    		writer.close();


		}


	}
