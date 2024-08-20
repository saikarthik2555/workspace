package com.setB;

import java.util.function.Function;

//import com.sun.java.swing.action.ApplyAction;

class SensorData {
	private double temperature;
	private double humidity;

	public SensorData(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public static void main(String[] args) {
		SensorData e=new SensorData(34.0, 12.0);
		Function<SensorData, Double> f = (s) -> {return s.getTemperature();};
		double temp=f.apply(e);
		System.out.println("temperature is : "+temp);
		//System.out.println(f.apply(e));
		double thresHold = 25.0;
		Function<Double,Boolean> douType=(d)->{
			if(temp>thresHold) return true;
			return false;
		};
		System.out.println(douType.apply(thresHold));
		
	}
	
}
