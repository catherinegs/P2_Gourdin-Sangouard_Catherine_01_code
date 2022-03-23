package com.hemebiotech.analyticsbis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class ListSymptoms {

	public static void main(String[] args) {
		
		ArrayList<Symptoms> symptomList = new  ArrayList<Symptoms>();
		
		
        	try {
    		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));

    		while ((reader.readLine())!= null) {
        		String  line = reader.readLine();

        	    String[] nameCol = line.split("");

    			
   			 String name = nameCol[1];
   			 int frequency = Integer.valueOf(nameCol[0]);
   			symptomList.add(new Symptoms(name, frequency));


                System.out.println(symptomList);

        
    		}reader.close();

    		Collections.sort(symptomList, new CustomCompratorList()); 
            System.out.println(symptomList);
   		
        	} catch (IOException e) {
				e.printStackTrace();
			}

 


	}

}
