package com.globant.bootcamp;

public class Forecast {
	
	private Day[] days;
	private Location location;
	
	public Forecast(){
		this.days = null;
		this.location = null;
	}
	
	public Forecast(Day[] d, Location loc){
		this.setDays(d);
		this.setLocation(loc);
	}

	public Day[] getDays() {
		return days;
	}

	public void setDays(Day[] days) {
		this.days = days;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
