package com.hemebiotech.analyticsbis;

import java.util.HashMap;
import java.util.Map;

import com.hemebiotech.analytics.Symptoms;

public class Compute {

	public static void main(String[] args) {

	        Map<Integer, Symptoms> cols = new HashMap<>();
	        
	        cols.put(1, new Symptoms("AliceBlue", 1));
	        cols.put(2, new Symptoms("GreenYellow", 2));
	        cols.put(3, new Symptoms("IndianRed", 3));
	        cols.put(4, new Symptoms("khaki", 4));
	        
	        System.out.printf("The size of the map is %d%n", cols.size());
	        
	        int key = 4;
	        
	        if (cols.containsKey(key)) {
	            
	            System.out.printf("The map contains key %d%n", key);
	        }
	        
	        cols.remove(1);
	        
	        System.out.printf("The size of the map is %d%n", cols.size());

	        cols.replace(3, new Symptoms("VioletRed", 6));
	        
	        Symptoms col = cols.get(3);
	        
	        System.out.printf("Colour name:%s colour code:%s %n", 
	                col.getName(), col.getFrequency());
	    }
		// TODO Auto-generated method stub

	

}
