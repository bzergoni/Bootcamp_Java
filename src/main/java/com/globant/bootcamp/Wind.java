package com.globant.bootcamp;

public class Wind {
	
	private double speed;
	private double chill;
	private double direction;
	
	public Wind(){
		this.speed = 0;
		this.setChill(0);
		this.setDirection(0);
	}
	
	//Creator function with setters and parameters 
	public Wind(double s, double c, double d){
		this.setSpeed(s);
		this.setChill(c);
		this.setDirection(d);
	}	
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getChill() {
		return chill;
	}

	public void setChill(double chill) {
		this.chill = chill;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}
}
