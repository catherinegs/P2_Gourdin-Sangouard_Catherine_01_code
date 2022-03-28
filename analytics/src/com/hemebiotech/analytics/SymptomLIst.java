package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SymptomLIst {
	
    public static void countFrequencies(ArrayList<String> result) throws FileNotFoundException
    {
        // Creating a File object that represents the disk file.
        PrintStream o = new PrintStream(new File("A.txt"));
  
        // Store current System.out before assigning a new value
        PrintStream console = System.out;
  
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        for (String t : result) {
            Integer c = tmap.get(t);
            if (c != null) {
            	tmap.put(t, c + 1);
            } else {
            	tmap.put(t, c);
            }
            
        }
        // Assign o to output stream
        System.setOut(o);
  
        for (Map.Entry m : tmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
        
        // Use stored value for output stream
        System.setOut(console);
        for (Map.Entry m : tmap.entrySet())

        System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
 
        
    }


	}
