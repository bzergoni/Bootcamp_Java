package com.globant.bootcamp;

public class Location {
	
	private String name;
	private String country;
	private String region;

	public Location(){
		this.setName(null);
		this.setCountry(null);
		this.setRegion(null);
	}
	
	//Another creator function with parameters and setters
	public Location(String n, String c, String r){
		this.setName(n);
		this.setCountry(c);
		this.setRegion(r);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
