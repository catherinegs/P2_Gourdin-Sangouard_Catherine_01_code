package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SymptomLIst {
	
    public static void countFrequencies(ArrayList<String> result)
    {
  
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        for (String t : result) {
            Integer c = tmap.get(t);
            if (c != null) {
            	tmap.put(t, c + 1);
            } else {
            	tmap.put(t, c);
            }
            
        }
  
        for (Map.Entry m : tmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }


	}
