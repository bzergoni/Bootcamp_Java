package com.globant.bootcamp;

public class Atmosphere {

	private double humidity;
	private double pressure;
	private double visibility;
	
	public Atmosphere(){
		this.setHumidity(0);
		this.setPressure(0);
		this.setVisibility(0);
	}

	public Atmosphere(double h, double p, double v){
		this.setHumidity(h);
		this.setPressure(p);
		this.setVisibility(v);
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getVisibility() {
		return visibility;
	}

	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}
	
}
