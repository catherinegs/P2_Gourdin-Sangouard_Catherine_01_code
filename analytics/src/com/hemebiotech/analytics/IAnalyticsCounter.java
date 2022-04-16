/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * Anything that will count symptoms frequencies from the reader
 * The important part is, the result from the operation, which is a map of keys (strings) and values (integer),
 * with unique key in ascending order
 * 
 * The implementation needs to order the collection
 * 
 */
public interface IAnalyticsCounter {
	/**
	 * key can not to be null, return an error
	 * 
	 * result is a object listing of all symptoms and their frequencies obtained from a data source, each key (or symptom name) are unique
	 * @return 
	 */
		
	TreeMap<String, Integer> countSymptoms() throws IOException;
	void saveFile(TreeMap<String, Integer> map) throws FileNotFoundException;


}
