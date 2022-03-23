package com.hemebiotech.analyticsbis;

public class Symptoms {
	
	private String name;
	private Integer frequency;
	
	public Symptoms(String name, Integer frequency) {
		this.name=name;
		this.frequency=frequency;
		
	}
	

	@Override
	public String toString() {
		return "Symptoms [name=" + name + ", frequency=" + frequency + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	

}
