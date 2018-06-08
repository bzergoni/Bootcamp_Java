package com.globant.bootcamp;

public class Day {
	
	private String name;
	private double thermalSensation;
	private Wind wind;
	private Atmosphere atmosphere;
	
	public Day(){
		this.setName(null);
		this.setThermalSensation(0);
		this.setWind(null);
		this.setAtmosphere(null);
	}

	public Day(String n, double ts, Wind w, Atmosphere a){
		this.setName(n);
		this.setThermalSensation(ts);
		this.setWind(w);
		this.setAtmosphere(a);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getThermalSensation() {
		return thermalSensation;
	}

	public void setThermalSensation(double thermalSensation) {
		this.thermalSensation = thermalSensation;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Atmosphere getAtmosphere() {
		return atmosphere;
	}

	public void setAtmosphere(Atmosphere atmosphere) {
		this.atmosphere = atmosphere;
	}
	
	

}
