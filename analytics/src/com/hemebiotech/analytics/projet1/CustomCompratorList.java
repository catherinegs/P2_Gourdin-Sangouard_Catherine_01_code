package com.hemebiotech.analytics.projet1;

import java.util.Comparator;

public class CustomCompratorList implements Comparator<Symptoms> {

@Override
public int compare(Symptoms o1, Symptoms o2) {

return o1.getName().compareTo(o2.getName());
}

}
