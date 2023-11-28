package org.javaturk.oofp.ch03.homework.homework3;

public class Celcius implements ConversionType {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Celcius";
	}

	@Override
	public double fahrenheit(double arg) {
		double fahrenheit = ((180*arg)/100)+32;
		return fahrenheit;
	}

	@Override
	public double conversion2(double arg) {
		double kelvin = arg + 273;
		return kelvin;
	}

}
